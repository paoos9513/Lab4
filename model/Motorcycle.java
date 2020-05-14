package model;

public class Motorcycle extends Vehicle{

    private int kilometers;
    private String typeMotorcycle;


    public Motorcycle(String brand, String model, int basePrice, int cylinder, String typeFuel,  String licensePlate, int kilometers, String typeMotorcycle, boolean isUsed,double tankCapacity) {
        super(brand, model, basePrice, cylinder, typeFuel,  licensePlate, isUsed, tankCapacity);
        this.kilometers = kilometers;
        this.typeMotorcycle = typeMotorcycle;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public String getTypeMotorcycle() {
        return typeMotorcycle;
    }

    public void setTypeMotorcycle(String typeMotorcycle) {
        this.typeMotorcycle = typeMotorcycle;
    }



}
