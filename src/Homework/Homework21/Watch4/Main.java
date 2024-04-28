package Homework.Homework21.Watch4;

class Watch {
    public synchronized void notifyGuard() {
        notify();
    }

    public synchronized void waitForGuard() throws InterruptedException {
        wait();
    }
}

class Guard extends Thread {
    private final Watch watch;
    private String name;
    private boolean isActive;
    public Guard(Watch watch,String name,boolean isActive) {

        this.watch = watch;
        this.name =name;
        this.isActive = isActive;
    }

    @Override
    public void run() {
        while (true) {
            try {
//
                if (!isActive){
                    isActive = true;
                    watch.waitForGuard();
                }
                System.out.println("Guard is on duty..."+name);
                System.out.printf("12 hours later\n");
                Thread.sleep(1000);
                System.out.println("Guard wakes up the other guard...");

                System.out.println("Guard goes to sleep..."+name);
                watch.notifyGuard();
                isActive = false;


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Watch watch = new Watch();
        Guard guard1 = new Guard(watch, "Guard 1",true);
        Guard guard2 = new Guard(watch,"Guard 2",false);

        guard1.start();
        guard2.start();
    }
}