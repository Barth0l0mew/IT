package Patterns.InnerNest;

public class InnerNested {
    /*
    Вложенный клаасс
    В Java существуют 4 типа вложенных (nested) классов:
    1. - Статические вложенные классы
    2. - Внутренние классы
    3. - Локальные классы
    4. - Анонимные (безымянные) классы
    */
    public static void main(String[] args) {
        Person user = new Person("User");
        user.addAccount("Pass");
        Math2.Factorial factorial = new Math2.Factorial(1,3);
        Math2.Factorial factorial1 = Math2.getFactorial(5);
        System.out.println(Math2.getFactorial(5).getResult());
    }
}
class Person {
    private String name;
    private String pass;
    public Person(String name){
        this.name=name;
    }
    public void addAccount (String pass){
            class Account {

                public void display (){

                    System.out.printf("Account login: %s\t Password: %s \n",name,pass);
                }
            }
            Account account = new Account();
            account.display();
    }

}
//Статический вложенный класс
class Math2{

    public static class Factorial{

        private int result;
        private int key;

        public Factorial(int result, int key){
            this.result=result;
            this.key = key;
        }

        public int getResult(){
            return result;
        }

        public int getKey(){
            return key;
        }
    }

    public static Factorial getFactorial(int key){
        int result=1;
        for (int i = 1; i <= key; i++)
            result *= i;
        return new Factorial(result, key);
    }
}
