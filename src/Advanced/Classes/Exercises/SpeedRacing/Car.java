package Advanced.Classes.Exercises.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private double distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distanceTraveled = 0;
    }
    public boolean drive(double kmToDrive) {
        double neededFuel = fuelCost * kmToDrive;
        if (neededFuel > fuelAmount) {
            return false;
        }
        this.fuelAmount -= neededFuel;
        this.distanceTraveled += kmToDrive;
        return true;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.0f", model, fuelAmount, distanceTraveled);
    }
}
