package Fundamentals.Objects.Objects2.SalesMan;

public class Car {
    private String model;
    private String engine;
    private String weight;
    private String color;

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(String model, String engine, String wight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = wight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
