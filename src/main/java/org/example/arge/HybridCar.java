package org.example.arge;

public class HybridCar extends  CarSkeleton{

    private double avgKmPerLitre;

    private int batterySize;

    private int cylinders;


    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + "car starting";
    }

    @Override
    public String drive() {
        return "run from Hybrid car";
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
