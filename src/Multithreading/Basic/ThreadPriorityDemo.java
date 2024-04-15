package Multithreading.Basic;

import java.time.Duration;
import java.time.Instant;

public class ThreadPriorityDemo extends Thread{
    public static void main(String[] args) {
        Thread thread1 = new ThreadPriorityDemo();
        thread1.setPriority(10);//низзкий приоретет 1 -низкий 10- высокий
        thread1.start();
        Thread thread2 = new ThreadPriorityDemo();
        thread2.setPriority(2);
        thread2.start();
    }
    @Override
    public void run (){
        Instant now = Instant.now();
        for (long i=0; i<1_000_000_000L; i++){

        }
        Duration duration = Duration.between(now,Instant.now());
        System.out.println(Thread.currentThread().getName()+" Thread  duration "+ duration);
    }

}
