package be.pxl.ja.oefening2;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Diesel");
        Car car2 = new Car("Benzine");

        Car.Engine engine = new Car.Engine();

        car1.start();
        car2.start();

        engine.start("Electricity");

        car1.getEngine().start(car1.getFuel());
        car2.getEngine().start(car2.getFuel());
    }
}
