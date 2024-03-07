package Homework.Homework18.FabricMethod;

public class LogisticShip implements Logistic{

    @Override
    public Transport creatTransport() {
        return new Ship();
    }
}
