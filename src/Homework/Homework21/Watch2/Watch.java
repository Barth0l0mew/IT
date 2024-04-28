package Homework.Homework21.Watch2;


public class Watch {
    private boolean isGuardOnDuty = false;

    public synchronized void guardOnDuty(String guardName) {
        while (isGuardOnDuty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(guardName + " is on duty.");
        isGuardOnDuty = true;

    }

    public synchronized void guardOffDuty() {
        isGuardOnDuty = false;
        notifyAll();
    }

    public static void main(String[] args) {
        Watch watch = new Watch();
        Guard guard1 = new Guard("Guard 1", watch);
        Guard guard2 = new Guard("Guard 2", watch);

        guard1.start();
        guard2.start();
    }
}
class Guard extends Thread {
    private String name;
    private Watch watch;

    public Guard(String name, Watch watch) {
        this.name = name;
        this.watch = watch;
    }

    @Override
    public void run() {
        while (true) {
            watch.guardOnDuty(name);
            try {
                sleep(1000); // Guard is on duty for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            watch.guardOffDuty();
        }
    }
}
