package Multithreading.Runners;

public class RunnersWait {
    public static void main(String[] args) throws InterruptedException {
        Runner runner1 = new Runner();
        runner1.start();

        Thread.sleep(300);
        runner1.stopProcess();
        Thread.sleep(3000);
        //runner1.waitProcess();
        runner1.resumeProcess();
        Thread.sleep(3000);
        runner1.interrupt();
    }
    static  class Runner extends Thread{
        public Object mutex = new Object();//подготовительное действие содать mutex
        private volatile boolean paused =false; // volatile - переменная

        @Override
        public void run() {

            int i=0;
            while (!isInterrupted()){
                System.out.println("Runner "+" is runner, step "+i++ );
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Runner "+  " finished" );
                    return;
                }
            }
        }
        public void  waitProcess (){
            //synchronized (mutex){
                if (paused)
                try {
                    mutex.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
           // }
        }
        public void resumeProcess(){
            //synchronized (mutex){
                if (paused) {
                    mutex.notifyAll();
                    startProcess();
                //}
            }
        }
        public void stopProcess (){
            paused = true;

        }
        public void startProcess (){
            paused = false;
        }
    }

}
