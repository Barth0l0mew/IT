package Game.HanoiTower;

//Ханойская башня
/*
Рекурсивно решаем задачу «перенести башню из n−1 диска на 2-й стержень».
Затем переносим самый большой диск на 3-й стержень.
Рекурсивно решаем задачу «перенести башню из n−1 диска на 3-й стержень».
 */
public class HanoiTower {
    private static int count = 5;
    private static int[][] discs = new int[count][3]; //для хранения количества дисков
    private static int[] counts = new int[3];
    private static int step=0;

    public static void main(String[] args) {
        init();
        System.out.println(toStringAligned());
//        moveOne(0,1);
        move(count,0,1,2);
        System.out.println(toStringAligned());
        System.out.println(step);
    }

    //Первоначальное расположение
    public static void init() {
        for (int i = 0; i < count; i++)
            discs[i][0] = count-i;
        counts[0] = count; //Заполнили первый стержень
    }
    //Преобразовать в строку с выравниванием
    public static String toStringAligned() {
        StringBuilder result = new StringBuilder();
        String pad = "     ";
        for (int i = count-1; i >=0; i--) {
            for (int j = 0; j<3; j++) {
                String sNumber = Integer.toString(discs[i][j]);
                String sPadded = pad.substring(sNumber.length()) + sNumber;
                if (j == 0) result.append(sNumber);
                else
                    result.append(sPadded);
            }
            result.append("\n");
        }
        result.append("___________\n");
        return result.toString();
    }
    public static void moveOne (int from, int to){
        //int i=discs[--counts[from]][from];
        if (counts[from]!=0)
        discs[counts[to]++][to]=discs[--counts[from]][from];
        discs[counts[from]][from]=0;
        step++;

    }
    public static void move (int count, int from, int aux, int to ){
        if (count==1){
            moveOne(from,to);

            return;
        }
        else {
            move (count-1,from,to, aux);
            moveOne(from,to);
            move(count-1,aux,from,to );
//            System.out.println(toStringAligned());



        }
    }

}