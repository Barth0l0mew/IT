package Homework.Homework18.FabricMethod;

public class Transporter {
    public static void main(String[] args) {
        try{
            Logistic logistic = chooseLogistic("truck");
            Transport truck = logistic.creatTransport();
            truck.delive();
        }catch (RuntimeException e){
            System.out.println(e);
        }
        try{
            Logistic logistic1 = chooseLogistic("ship");
            Transport ship = logistic1.creatTransport();
            ship.delive();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        try{
            Logistic logistic2 = chooseLogistic("bike");
            Transport bike = logistic2.creatTransport();
            bike.delive();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


    }
    static Logistic chooseLogistic (String str){
        if (str.equalsIgnoreCase("truck"))
            return new LogisticTruck();
        else if (str.equalsIgnoreCase("ship"))
            return new LogisticShip();
        else
            throw new RuntimeException(String.format("Logistic %s - not-found",str));
    }
}
