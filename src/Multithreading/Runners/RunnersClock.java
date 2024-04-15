package Multithreading.Runners;

public class RunnersClock {
    public static void main(String[] args) {
        Runner runner1 = new Runner(1);
        Runner runner2 = new Runner(2);
        Thread tread1 = new Thread(runner1);
        Thread tread2 = new Thread(runner2);
        tread1.start();
        tread2.start();
    }
    static  class Runner implements Runnable{
        private int index;
        public Runner (int index){
            this.index=index;
        }
        @Override
        public void run() {
            long start = System.currentTimeMillis();
            long finish = start+3*1000;
            int i=0;
            while (System.currentTimeMillis()<finish){
                System.out.println("Runner "+index+" is runner, step "+i++ );
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
