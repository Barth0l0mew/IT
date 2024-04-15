package Multithreading.Runners;

public class Runners {
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
            for (int i=0;i<5;i++){
                System.out.println("Runner "+index+" is runner, step "+i );
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
