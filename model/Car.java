package model;

public class Car extends Vehicle{

    private int kilometers;
    private int numberDoor;
    private String typeCar;
    private boolean tintedWindows;


    public Car(String brand, String model, int basePrice, int cylinder, String typeFuel, String licensePlate, int kilometers, int numberDoor, String typeCar, boolean tintedWindows, boolean isUsed) {
        super(brand, model, basePrice, cylinder, typeFuel, licensePlate, isUsed);
        this.kilometers = kilometers;
        this.numberDoor = numberDoor;
        this.typeCar = typeCar;
        this.tintedWindows = tintedWindows;

    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public int getNumberDoor() {
        return numberDoor;
    }

    public void setNumberDoor(int numberDoor) {
        this.numberDoor = numberDoor;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public boolean isTintedWindows() {
        return tintedWindows;
    }

    public void setTintedWindows(boolean tintedWindows) {
        this.tintedWindows = tintedWindows;
    }


}
