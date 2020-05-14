package model;

public class Car extends Vehicle{

    private int kilometers;
    private int numberDoor;
    private String typeCar;
    private boolean tintedWindows;
    private double batteryLife;
    private String typeCharge;
    private double consumeBattery;

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

    public double getConsumeBattery() {
        return consumeBattery;
    }


    public void setConsumeBattery(double consumeBattery){


        if(getTypeFuel().equalsIgnoreCase("electrico") && getTypeCharge().equalsIgnoreCase("rapida")){

            this.consumeBattery = ((this.batteryLife+10)*(this.getCylinder()/100));

        } else if (getTypeFuel().equalsIgnoreCase("electrico") && getTypeCharge().equalsIgnoreCase("normal")) {

            this.consumeBattery = ((this.batteryLife+15)*(this.getCylinder()/100));

        }else if (getTypeFuel().equalsIgnoreCase("hibrido") && getTypeCharge().equalsIgnoreCase("rapido")){

            this.consumeBattery = (this.batteryLife*(this.getCylinder()/100));

        }else if (getTypeFuel().equalsIgnoreCase("hibrido") && getTypeCharge().equalsIgnoreCase("normal")){

            this.consumeBattery = ((this.batteryLife+5)*(this.getCylinder()/100));

        }else {
            System.out.println("Este vehiculo no tiene consumo electrico");
        }

    }
}
