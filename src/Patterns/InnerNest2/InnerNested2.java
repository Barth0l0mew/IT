package Patterns.InnerNest2;

public class InnerNested2 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        car.driver.go();
        System.out.println(car);
        Car.Player passenger = new Car.Player();
        passenger.play();
        System.out.println(Car.playerOn);
        System.out.println(car);
        car.move();
        car.play();


    }

}
class Car {
    //Руль находится внутри автомобиля, поэтому private
    private int wheelAngle = 0; //Угол руля
    private boolean ignitionOn = false; //Ключ зажигания
    //Плейер
    public static boolean playerOn = false; //Плеер
    public Driver driver = new Driver();

    @Override
    public String toString() {
        return "Car{" +
                "wheelAngle=" + wheelAngle +
                ", ignitionOn=" + ignitionOn +
                ", driver=" + driver +
                '}';
    }

    // Inner class внутренний класс
    protected class Driver {
        public void go (){
            wheelAngle =120;
            ignitionOn = true;
            playerOn = true;
        }
    }
    //Статтический вложенный
    public static class Player {
        public void play (){
            Car.playerOn = true;
        }
    }
    //Local class Локальный класс
    public void move(){
        class Navigator{
            public void navigate(){
                System.out.println("navigator");
            }
        }
        Navigator navigator = new Navigator();
        navigator.navigate();
    }
    //Чтобы создать анонимный класс, нужен родительский класс или интерфейс
    interface Remotable{
        void remote();
    }
    //Anonymous class
    public void play(){
        new Remotable(){
            @Override
            public void remote() {
                playerOn = true;
                System.out.println("DVD player run");
            }
        }.remote();
    }

}
