package be.pxl.ja.oefening1;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Car("Diesel");
        Car car1 = new Car("Electricity");

        car.start();
        car1.start();
    }
}
