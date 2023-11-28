package Homework.Homework3;

public class Task3_33 {
    public static void main(String[] args) {
        /*
        Записать условие, которое является истинным, когда точка с координатами (х, у)
попадает в заштрихованные участки плоскости, включая их границы (рис. 3.2).
         */
        double x1=-2;
        double y1=2;
        System.out.println("a ="+(x1<=-1&&y1<=-2));
        x1=1;
        y1=2;
        System.out.println("б ="+(y1>=1||y1<=-3));
        x1=1;
        y1=-2;
        System.out.println("в ="+(y1>=1||(y1<=-3&&y1>=-4)));
        x1=0;
        y1=1;
        System.out.println("г ="+((x1>=-1&&x1<=1.5)&&(y1<=1.5&&y1>=-0.5)));
        x1=2;
        y1=1;
        System.out.println("д ="+((x1>=1&&x1<=4)&&(y1<=4&&y1>=2)));
        x1=2;
        y1=1;
        System.out.println("e ="+((x1<=-1&&y1>=1)||(x1>=2&&y1>=1)));
        x1=2;
        y1=1;
        System.out.println("ж ="+((x1>=1&&x1<=3)&&(y1<=1&&y1>=-3)));
        x1=-2;
        y1=2;
        System.out.println("з ="+((y1>=1.5)||(x1>=1&&x1<=2.5&&y1<=1.5)));
    }
}
