package Exam.Exam_1;

import java.util.Arrays;
import java.util.Scanner;

/*
2. На поле размером nxm размещены корабли (2 трехпалубных, 3 двухпалубных, 4 однопалубных)
        [[0,0,0,1,1,0],
         [0,1,0,0,0,0],
         [0,1,0,1,0,0],
         [0,1,0,1,0,0]];

При ходе [2, 1] программа выдает число 3, т.к. подбит трехпалубный корабль
При ходе [1, 3] программа выдает число 0 (промах) и т.д.
Изменить условие так, чтобы каждый из кораблей мог "отразить" одну атаку,
выдав 0 при первом попадании в него.
Разработать алгоритм, который подобьет все корабли если не за минимальное,
то за некоторое удовлетворительное число ходов.
 */
public class SeeBattle {
    public static void main(String[] args) {
        int[][] area = {{0,0,0,0,0,0,0,0,0,0},
                        {0,1,0,0,0,0,0,1,1,0},
                        {0,1,0,1,1,0,0,0,0,0},
                        {0,1,0,0,0,0,0,0,0,0},
                        {0,0,0,1,0,0,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,1,0,0,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,1,1,1,0,0,1,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0}

        };
        print(area);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input  level: ");
        int item = scanner.nextInt();
        //System.out.println(item );
        switch (item){
            case 1:
                level1(area);
                break;
            case 2:
                level2(area);
                break;
            case 3:
                level3(area);
                break;
            default:
                System.out.println("not found level");
        }
    }
    static void print (int[][] area){
        for (int[] item :area){
            System.out.println(Arrays.toString(item));
        }
    }
    static void level1 (int[][] area){
        /*
        При ходе [2, 1] программа выдает число 3, т.к. подбит трехпалубный корабль
        При ходе [1, 3] программа выдает число 0 (промах) и т.д.
         */
        Scanner scanner = new Scanner(System.in);
        String strX ="";
        String strY ="";
        int x;
        int y;
        int count=1;


        while (true ){
            System.out.println("Для выхода введите координату больше 10 или меньше 1");
            System.out.print("input x=");
            x= scanner.nextInt()-1;
            System.out.print("input y=");
            y=scanner.nextInt()-1;
            if ((x<0 || x>9) || (y<0 ||y>9)){
                System.out.println("Exit");
                break;
            }
            if( area[x][y]==0){
                System.out.println("0");
            } else{
                System.out.println("Death ship "+find(area,x,y));
                count=1;
            }
        }
    }
    static int find (int[][] area, int x, int y){
        int count=1;
        for (int i=x; i< area.length;i++){
            if (area[i+1][y]==0)
                break;
            else
                count++;
        }
        for (int i=x;i>0;i++) {
            if (area[i - 1][y] == 0)
                break;
            else
                count++;
        }
        for (int j=y;j<area[x].length;j++){
            if (area[x][j+1]==0)
                break;
            else
                count++;
        }
        for (int j=y;j>0;j--){
            if (area[x][j-1] == 0)
                break;
            else
                count++;
        }
        return count;
    }
    static  void level2 (int[][] area ){
      /*
      Изменить условие так, чтобы каждый из кораблей мог "отразить" одну атаку,
выдав 0 при первом попадании в него.
       */
        int[][] hit = new int[10][10];
        Scanner scanner = new Scanner(System.in);
        String strX ="";
        String strY ="";
        int x;
        int y;
        int count=1;

        while (true ){
            System.out.println("Для выхода введите координату больше 10 или меньше 1");
            System.out.print("input x=");
            x= scanner.nextInt()-1;
            System.out.print("input y=");
            y=scanner.nextInt()-1;
            if ((x<0 || x>9) || (y<0 ||y>9)){
                System.out.println("Exit");
                break;
            }
            if( area[x][y]==0 ){
                System.out.println("0");
            } else{
                if (hit[x][y]==0) {
                    hit[x][y] = area[x][y];
                    for (int i = x; i < area.length; i++) {
                        if (area[i + 1][y] == 0)
                            break;
                        else
                            hit[i + 1][y] = area[i + 1][y];
                    }
                    for (int i = x; i > 0; i++) {
                        if (area[i - 1][y] == 0)
                            break;
                        else
                            hit[i - 1][y] = area[i - 1][y];
                    }
                    for (int j = y; j < area[x].length; j++) {
                        if (area[x][j + 1] == 0)
                            break;
                        else
                            hit[x][j + 1] = area[x][j + 1];
                    }
                    for (int j = y; j > 0; j--) {
                        if (area[x][j - 1] == 0)
                            break;
                        else
                            hit[x][j - 1] = area[x][j - 1];
                    }
                    System.out.println("0");
                    //System.out.println("result");
                    //print(hit);
                }
                else {
                    System.out.println("Death "+find(area,x,y));
                }

            }
        }

    }
    static void level3 (int[][] area){
        int ship=0;
        int count=0;
        int[][] hit = new int[10][10];
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        while (true){
            System.out.println("Для выхода введите координату больше 10 или меньше 1");
            System.out.print("input x=");
            x= scanner.nextInt()-1;
            System.out.print("input y=");
            y=scanner.nextInt()-1;
            // if (x>=10|| y>=10){
            if ((x<0 || x>9) || (y<0 ||y>9)){
                System.out.println("Exit");
                break;
            }
            count++;
            if (area[x][y]==1){
                ship++;
                hit[x][y]=1;
            }
            print(hit);
            System.out.println(ship);
            if (ship==16){
                System.out.println("Все корабли убиты за "+count+ " ходов");
                break;
            }
        }

    }

}
