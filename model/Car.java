package model;

public class Car extends Vehicle{

    private int kilometers;
    private int numberDoor;
    private String typeCar;
    private boolean tintedWindows;
    private double batteryLife;
    private String typeCharge;

    public Car(String brand, String model, int basePrice, int cylinder, String typeFuel, String licensePlate, int kilometers, int numberDoor, String typeCar, boolean tintedWindows, boolean isUsed, double tankCapacity, double batteryLife,String typeCharge) {
        super(brand, model, basePrice, cylinder, typeFuel, licensePlate, isUsed,tankCapacity);
        this.kilometers = kilometers;
        this.numberDoor = numberDoor;
        this.typeCar = typeCar;
        this.tintedWindows = tintedWindows;
        this.batteryLife=batteryLife;
        this.typeCharge=typeCharge;

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

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {

        this.batteryLife = batteryLife;
    }

    public String getTypeCharge() {
        return typeCharge;
    }

    public void setTypeCharge(String typeCharge) {
        this.typeCharge = typeCharge;
    }

    public void consumeBattery(){

        double consumeBattery;


        if(getTypeFuel().equalsIgnoreCase("electrico") && getTypeCharge().equalsIgnoreCase("rapida")){

            consumeBattery = ((batteryLife+10)*(getCylinder()/100));

        } else if (getTypeFuel().equalsIgnoreCase("electrico") && getTypeCharge().equalsIgnoreCase("normal")) {

            consumeBattery = ((batteryLife+15)*(getCylinder()/100));

        }else if (getTypeFuel().equalsIgnoreCase("hibrido") && getTypeCharge().equalsIgnoreCase("rapido")){

            consumeBattery = (batteryLife*(getCylinder()/100));

        }else if (getTypeFuel().equalsIgnoreCase("hibrido") && getTypeCharge().equalsIgnoreCase("normal")){

            consumeBattery = ((batteryLife+5)*(getCylinder()/100));

        }else {
            System.out.println("Este vehiculo no tiene consumo electrico");
        }
        
    }
}
