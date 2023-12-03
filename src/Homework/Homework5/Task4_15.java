package Homework.Homework5;

public class Task4_15 {
    /*
. Известны год и номер месяца рождения человека, а также год и номер месяца
сегодняшнего дня (январь — 1 и т. д.). Определить возраст человека (число
полных лет). В случае совпадения указанных номеров месяцев считать, что
прошел полный год.
     */
    public static void main(String[] args) {
        int year=2023, month=5;
        int birthMan=1992, monthMan=5;
        if (monthMan<=month)
            System.out.println("old year="+(year-birthMan));
        else
            System.out.println("old year="+(year-birthMan-1));
    }
}
