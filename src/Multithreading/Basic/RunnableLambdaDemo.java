package Multithreading.Basic;

public class RunnableLambdaDemo {
    public static void main(String[] args) {
        System.out.println("Lambda");
        System.out.println("Thread : " + Thread.currentThread().getName());

        System.out.println("Creating Runnable...");
        Runnable runnable = () -> {
                for (int i=0; i>5; i++)
                    System.out.println("Thread : " + Thread.currentThread().getName()+" is running...");
                System.out.println("Finish:" + Thread.currentThread().getName());
        };

        System.out.println("Creating Thread...");
        Thread thread = new Thread(runnable);

        System.out.println("Starting Thread...");
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish:" + Thread.currentThread().getName());
    }
} 