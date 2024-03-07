package Homework.Homework18.FabricMethod;

public class LogisticTruck implements Logistic{
    @Override
    public Transport creatTransport() {
        return new Truck();
    }
}
