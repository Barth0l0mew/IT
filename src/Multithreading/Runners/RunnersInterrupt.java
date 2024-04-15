package Multithreading.Runners;

public class RunnersInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Runner runner1 = new Runner(1);
        Runner runner2 = new Runner(2);
        Thread tread1 = new Thread(runner1);
        Thread tread2 = new Thread(runner2);
        tread1.start();
        tread2.start();
        Thread.sleep(1000);
        tread1.interrupt();
        tread2.interrupt();
    }
    static  class Runner implements Runnable{
        private int index;

        public Runner (int index){
            this.index=index;
        }

        @Override
        public void run() {

            int i=0;
            while (true){
                System.out.println("Runner "+index+" is runner, step "+i++ );
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Runner "+ index + " finished" );
                    return;
                }
            }
        }
    }

}
