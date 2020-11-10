package be.pxl.ja.oefening1;

public class Car {
    private Engine engine;
    private String fuel;

    public Car(String f){
        fuel = f;
        engine = new Engine();
    }

    public void start(){
        engine.start();
    }

    public class Engine{
        public void start(){
            System.out.println("Engine is running.\nFuel: " + fuel);
        }
    }
}
