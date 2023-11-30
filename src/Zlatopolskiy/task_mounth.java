package Zlatopolskiy;

public class task_mounth {
    public static void main(String[] args) {
        int mounth=15;
        switch (mounth){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("нет месяца");
        }
        /*
        //для выше jdk14

        int n = 11;
        String season = "";
        switch (n) {
            case 12,1,2:
                season = "winter"; break;
            case 3,4,5:
                season = "spring"; break;
            case 6,7,8:
                season = "summer"; break;
            case 9,10,11:
                season = "autumn";
        }
        System.out.println(season);
         */
    }
}
