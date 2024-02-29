package Exeptionsed;

public class ThrowsExceptions {
    public static void main(String[] args) {
        try {
            System.out.println(getSeason(13));
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println("nu-nu");

        }
        try {
            getMethorCaller();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    static String getSeason(int monthNumber){
        if (monthNumber<1||monthNumber>12)
            throw new IllegalArgumentException(String.format("Month: %d not number",monthNumber));
        if (monthNumber<3) return "winter";
        else if (monthNumber<6) return "spring";
        else if (monthNumber<9) return "summer";
        else if (monthNumber<12) return "autumn";
        else return "winter";
    }
    static void getMethorCaller () throws Exception{
        Exception e =new Exception("my message");
        //throw e;
        String classNme = e.getStackTrace()[1].getClassName();
        System.out.println(classNme);
        String methodNme = e.getStackTrace()[1].getMethodName();
        System.out.println(methodNme);
        int line = e.getStackTrace()[0].getLineNumber();
        System.out.println(line);
    }
}
