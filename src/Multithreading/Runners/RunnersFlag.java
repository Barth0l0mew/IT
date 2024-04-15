package Multithreading.Runners;

public class RunnersFlag {
    public static void main(String[] args) throws InterruptedException {
        Runner runner1 = new Runner(1);
        Runner runner2 = new Runner(2);
        Thread tread1 = new Thread(runner1);
        Thread tread2 = new Thread(runner2);
        tread1.start();
        tread2.start();
        Thread.sleep(1000);
        runner1.setFlag(true);
        runner2.setFlag(true);
    }
    static  class Runner implements Runnable{
        private int index;

        private boolean flag =false;
        public Runner (int index){
            this.index=index;
        }
        public Runner setFlag(boolean flag) {
            this.flag = flag;
            return this;
        }
        @Override
        public void run() {

            int i=0;
            while (!flag){
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
