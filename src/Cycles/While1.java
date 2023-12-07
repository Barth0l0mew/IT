package Cycles;

public class While1 {
    /*
    Кузнечик прыгает на 1 см,
     затем на 2, на 3 и т.д.
     Через сколько прыжков он взберется
     на травинку высотой 50 см?
*/
    public static void main(String[] args) {
     int i=0 ;
     int hope=1;
     int height=0;
        for (int j=0; j<20; j++){
            height+=hope;
            hope++;
            if (height>50) height = 50;
            System.out.println(j+" "+height);
            if (height==50) {
                break;
            }
        }
        hope=1;
        height=0;
        while (height<50){
         height+=hope;
         if (height>50) height=50;
         System.out.printf("%d %d %d \n",i,hope,height);
         hope+=1;
         i++;
     }

    }
}

