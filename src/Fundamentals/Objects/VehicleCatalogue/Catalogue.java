package Fundamentals.Objects.VehicleCatalogue;

public class Catalogue {
    private String typeOfVehicle;
    private String modelOfVehicle;
    private String color;
    private Double horsePower;

    public Catalogue(String typeOfVehicle, String modelOfVehicle, String color, double horsePower) {
        this.typeOfVehicle = typeOfVehicle;
        this.modelOfVehicle = modelOfVehicle;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getModelOfVehicle() {
        return modelOfVehicle;
    }

    public String getColor() {
        return color;
    }

    public Double getHorsePower() {
        return horsePower;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "typeOfVehicle='" + typeOfVehicle + '\'' +
                ", modelOfVehicle='" + modelOfVehicle + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
