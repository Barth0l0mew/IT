package Multithreading.Basic;

public class RunnableAnonymus {
    public static void main(String[] args) {
        System.out.println("Main: "+Thread.currentThread().getName());
        Runnable running = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++)
                    System.out.println("Child: "+Thread.currentThread().getName());
                System.out.println("Child  has been finished");
            }
        };
        System.out.println("Creating child tread");
        Thread thread = new Thread(running);
        System.out.println("Starting child thread");
        thread.start();
        //родительский поток дожидается окончания дочерний
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main has benn finished");
    }
}
