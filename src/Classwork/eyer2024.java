package Classwork;

public class eyer2024 {
    public static void main(String[] args) {
        int eyer=2024;
        int day = 13;
        int temp=0;
        int month = 0;
        int dayCurr=0;
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
//        for (int i = 1; i <366 ; i++) {
//            dayCurr = i-temp;
//            if (dayCurr%days[month]==0){
//                temp+=days[month];
//                month+=1;
//                System.out.println();
//            }
//            System.out.print(dayCurr+" ");
//            if (dayCurr==13&&i%6==0)
//                System.out.println("day "+dayCurr+" ");
//        }
        for (int i=5;i<366;i+=7){
            month=0;
            dayCurr=i;
            while  (dayCurr>0)
                dayCurr-=days[month++];
                dayCurr+=days[month-1];
                if (dayCurr==day)
                    System.out.println(month);

        }


    }
}
