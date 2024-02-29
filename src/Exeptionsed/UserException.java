package Exeptionsed;

public class UserException {
    public static void main(String[] args) throws UserNotEvenException {
//
//        int a=1;
//        if (a==1)
//            throw new UserNotEvenException("Not Even number");
        try {
            Person person = new Person("Alina");
        } catch (NotCapitalLetterException e) {
            throw new RuntimeException(e);
        }
        try {
            Person person2 = new Person("alina");
        } catch (NotCapitalLetterException e) {
            throw new RuntimeException(e);
        }
    }
}
class UserNotEvenException extends Exception{
    public UserNotEvenException (String s){
        super(s);
    }

}
class Person{
    private String name = "";
    Person(String name) throws NotCapitalLetterException{

        this.name
                = name;
        validateName();
    }

    private void validateName() throws NotCapitalLetterException{

        if (Character.isLowerCase(name.charAt(0))) {
            throw new NotCapitalLetterException("The first letter of name "+name+ " must be capital");
        }
    }
}

class NotCapitalLetterException extends Exception {

    NotCapitalLetterException(String str) {
        super(str);
    }
}
