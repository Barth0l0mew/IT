package Homework.Homework21.Watch3;

public class Solder {
    public static void main(String[] args) {
        Watch watch = new Watch();
        watch.start();
        Guard guard1 = new Guard(watch,"Guard 1",true);
        Guard guard2 = new Guard(watch,"Guard 2",false);
        guard1.setOtherGUard(guard2);
        guard2.setOtherGUard(guard1);
        guard1.start();
        guard2.start();
    }
}
class Watch extends Thread{
 int time =0;
 public synchronized void run() {
     while(true){
         try {
             Thread.sleep(100);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         time++;
         System.out.printf("time %d\n",time);
         if (time == 10){
             //time=0;
             try {
                 wait();
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
     }
 }
}
class Guard extends Thread {
   private Watch watch;
   private String name;
   private boolean isActive;
   private Guard otherGUard;
    public Guard(Watch watch, String name, boolean isActive) {
        this.watch = watch;
        this.name = name;
        this.isActive = isActive;
    }

    public void setOtherGUard(Guard otherGUard) {
        this.otherGUard = otherGUard;
    }

    public synchronized void run() {
       while(true){
           if (!isActive){
               try {
                   System.out.printf("guard %s to sleep\n", name);
                   wait();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }

           }
           //System.out.printf("time %d\n",watch.time);
           if (watch.time ==10 ){
               System.out.printf("Guard %s to work\n", name);
               isActive = false;
               otherGUard.isActive = true;
               notifyAll();
           }
       }
    }
}

