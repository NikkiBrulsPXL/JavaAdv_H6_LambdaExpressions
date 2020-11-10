package be.pxl.ja.oefening2;

public class Car {
    private Engine engine;
    private String fuel;

    public Car(String fuel){
        this.fuel = fuel;
        engine = new Engine();
    }

    public Engine getEngine(){
        return engine;
    }

    public String getFuel(){
        return fuel;
    }

    public void start(){
        engine.start(fuel);
    }

    public static class Engine{
        public void start(String fuel){
            System.out.println("Engine is running.\nFuel: " + fuel);
        }
    }
}
