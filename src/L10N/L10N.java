package L10N;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class L10N {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Choose language (0-en 1-ru)");
        int language = scanner.nextInt();
        Locale locale;
        switch (language){
            case 0:
                locale = new Locale("en","US");
                break;
            case 1:
                locale = new Locale("ru", "RU");
                break;
            default:
                locale = new Locale("en","US");
                break;
        }
        ResourceBundle rb = ResourceBundle.getBundle("L10N/Resurse/L10N",locale);
        System.out.println(rb.getString("key"));
    }
}
