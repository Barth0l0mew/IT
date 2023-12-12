package Homework.Homework7;

import javax.imageio.ImageTranscoder;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Task7_78 {
    /*
    5.78. Вычислить приближенно площадь одной арки синусоиды.
     */
    public static void main(String[] args) {
        double delta=0.1;
        double area=0;
        double x=0;
        //System.out.println(Math.sin(Math.PI));
        while (x<=Math.PI){

            x+=delta;
            area+=(Math.sin(x)*delta);

        }
        System.out.println("area sin="+area);

        System.out.println();
        int n=10000;
        delta=Math.PI/n;
        x=0;
        area=0;
        for (int i=1;i<=n;i++){
            x+=delta;
            area+=(Math.sin(x)*delta);

        }
        System.out.println("2area sin="+area);
    }
}
