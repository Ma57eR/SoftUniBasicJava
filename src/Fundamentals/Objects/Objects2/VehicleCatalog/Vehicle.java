package Fundamentals.Objects.Objects2.VehicleCatalog;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getType() {
        return type;
    }

    public String printVehicle() {
        return "Type: " + this.type + "\n"
                + "Model: " + this.model + "\n"
                + "Color: " + this.color + "\n"
                + "Horsepower: " + this.horsePower + "\n";
    }
}
