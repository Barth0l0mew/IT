package Homework.Homework3;

public class Task3_32 {
    public static void main(String[] args) {
        /*
        Записать условие, которое является истинным, когда точка с координатами (х, у)
попадает в заштрихованные участки плоскости, включая их границы (рис. 3.1).
         */
        double x1=-3, y1=2;
        System.out.println("a ="+(x1<=-2&&y1>=1));
        x1=3;
        y1=2;
        System.out.println("б ="+(y1>=-2&&y1<=1.5));
        x1=5;
        y1=2;
        System.out.println(("в ="+((x1>=1&&x1<=2)&&(y1<=4&&y1>0))));
        x1=3;
        y1=2;
        System.out.println("г ="+((y1>=2&&y1<=4)&&(x1>=1)));
        x1=-3;
        y1=2;
        System.out.println("д ="+((x1>=2&&y1>=0)||(x1>=1&&y1<=-1)));
        x1=3;
        y1=-2;
        System.out.println("е ="+((x1>=2&&y1>=1)||(x1>=2&&y1>=-1.5)));
        x1=2;
        y1=-2;
        System.out.println("ж ="+((x1>=1&&x1<=3)&&(y1>=-2&&y1<=-1)));
        x1=2;
        y1=1;
        System.out.println("з ="+((x1<2&&y1>0.5&&y1<1.5)||x1>=2));


    }

}
