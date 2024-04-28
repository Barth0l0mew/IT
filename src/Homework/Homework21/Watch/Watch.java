package Homework.Homework21.Watch;

public class Watch {


    public static void main(String[] args) {
        Watch watch = new Watch();
        Guard guard1 = new Guard("Guard 1", watch);
        Guard guard2 = new Guard("Guard 2", watch);

        guard1.start();
        guard2.start();

        try {
            guard1.join();
            guard2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
            synchronized (watch) {
                try {
                    System.out.println(name + " is on duty for 12 hours.");
                    Thread.sleep(1000);
                    watch.notify();
                    watch.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
