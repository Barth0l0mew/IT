package Homework.Homework4;
import java.util.Scanner;

public class Task5 {
    /*
Задание 5
Организовать ввод с клавиатуры даты рождения человека. Программа должна вывести знак зодиака и название 
года по китайскому календарю. 
Пример входных данных: 
5 12 1974 
Вывод:
Знак: Стрелец
Год: Тигра
     */
    public static void main(String[] args) {
        String[] yearName ={"Крыса","Бык","Тигр","Кролик","Дракон","Змея","Лошадь","Овца","Обезьяна","Петух","Собака","Свинья"};
        int yearStart=1900;
        int index;
        Scanner scan = new Scanner(System.in);
        int day= scan.nextInt();
        int month= scan.nextInt();
        int year= scan.nextInt();
        System.out.println(day+" "+month+" "+year);
        //index=(year-yearStart)%12;
        if (year>=yearStart){
            index = (year-yearStart)%12;
        }
        else {
            index = 12-(yearStart-year)%12;
        }
        System.out.println("Год: "+yearName[index]);
        switch (month){
            case 1:{
                if (day<=20)
                    System.out.println("Козерог");
                else
                    System.out.println("Водолей");
                break;
            }
            case 2:{
                if (day<=19)
                    System.out.println("Водолей");
                else
                    System.out.println("Рыба");
                break;
            }
            case 3:{
                if (day<=20)
                    System.out.println("Рыба");
                else
                    System.out.println("Овен");
                break;
            }
            case 4:{
                if (day<=20)
                    System.out.println("Овен");
                else
                    System.out.println("Телец");
                break;
            }
            case 5:{
                if (day<=20)
                    System.out.println("Телец");
                else
                    System.out.println("Близнецы");
                break;
            }
            case 6:{
                if (day<=21)
                    System.out.println("Близнецы");
                else
                    System.out.println("Рак");
                break;
            }
            case 7:{
                if (day<=22)
                    System.out.println("Рак");
                else
                    System.out.println("Лев");
                break;
            }
            case 8:{
                if (day<=23)
                    System.out.println("Лев");
                else
                    System.out.println("Дева");
                break;
            }
            case 9:{
                if (day<=23)
                    System.out.println("Дева");
                else
                    System.out.println("Весы");
                break;
            }
            case 10:{
                if (day<=23)
                    System.out.println("Весы");
                else
                    System.out.println("Скорпион");
                break;
            }
            case 11:{
                if (day<=22)
                    System.out.println("Скорпион");
                else
                    System.out.println("Стрелец");
                break;
            }
            case 12:{
                if (day<=21)
                    System.out.println("Стрелец");
                else
                    System.out.println("Козерок");
                break;
            }
        }
    }
}
