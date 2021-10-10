package Advanced.Classes.Exercises.CarSalesman;

public class Car {
    private String model;
    private String engine;
    private String weight;
    private String color;

    public Car(String model, String engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(String model, String engine, String weight) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
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
