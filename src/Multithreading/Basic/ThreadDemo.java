package Multithreading.Basic;

public class ThreadDemo extends Thread{
    public static void main(String[] args) {
        System.out.println("Main: "+Thread.currentThread().getName());
        System.out.println("Creating child tread");
        Thread thread = new ThreadDemo();
        System.out.println("Child is  starting");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("finish "+Thread.currentThread().getName());

    }
    @Override
    public void run (){
        for (int i=0;i<3;i++){
            System.out.println("Thread "+i);
        }
        System.out.println("Thread "+Thread.currentThread().getName());

    }
}
