package model;

/**
 * The type Car.
 */
public class Car extends Vehicle{
    //atributos
    private int kilometers;
    private int numberDoor;
    private String typeCar;
    private boolean tintedWindows;
    private double batteryLife;
    private String typeCharge;
    private double consumeBattery;

    /**
     * this is the constructor method that allows me to give value to attributes
     *
     * @param brand         the brand
     * @param model         the model
     * @param basePrice     the base price
     * @param cylinder      the cylinder
     * @param typeFuel      the type fuel
     * @param licensePlate  the license plate
     * @param kilometers    the kilometers
     * @param numberDoor    the number door
     * @param typeCar       the type car
     * @param tintedWindows the tinted windows
     * @param isUsed        the is used
     * @param tankCapacity  the tank capacity
     * @param batteryLife   the battery life
     * @param typeCharge    the type charge
     * @author Paola Osorio
     */
    public Car(String brand, String model, int basePrice, int cylinder, String typeFuel, String licensePlate, int kilometers, int numberDoor, String typeCar, boolean tintedWindows, boolean isUsed, double tankCapacity, double batteryLife,String typeCharge) {
        super(brand, model, basePrice, cylinder, typeFuel, licensePlate, isUsed,tankCapacity);
        this.kilometers = kilometers;
        this.numberDoor = numberDoor;
        this.typeCar = typeCar;
        this.tintedWindows = tintedWindows;
        this.batteryLife=batteryLife;
        this.typeCharge=typeCharge;

    }

    /**
     * this method gives me the kilometers of the car
     *
     * @return int kilometers
     * @author Paola Osorio
     */
    public int getKilometers() {
        return kilometers;
    }

    /**
     * this method allows me to modify the kilometers of the car
     *
     * @param kilometers this is a type parameter int. kilometers != null
     * @author Paola Osorio
     */
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    /**
     * this method gives me the number door of the car
     *
     * @return int numberDoor
     * @author Paola Osorio
     */
    public int getNumberDoor() {
        return numberDoor;
    }

    /**
     * this method allows me to modify the number Door that have of the car
     *
     * @param numberDoor this is a type parameter int. numberDoor  != null
     * @author Paola Osorio
     */
    public void setNumberDoor(int numberDoor) {
        this.numberDoor = numberDoor;
    }

    /**
     * this method gives me the type car of the car
     *
     * @return String typeCar
     * @author Paola Osorio
     */
    public String getTypeCar() {
        return typeCar;
    }

    /**
     * this method allows me to modify the type car
     *
     * @param typeCar this is a type parameter String. typeCar  != null
     * @author Paola Osorio
     */
    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    /**
     * this method gives me is tinted windows of the car
     *
     * @return boolean numberDoor
     * @author Paola Osorio
     */
    public boolean isTintedWindows() {
        return tintedWindows;
    }

    /**
     * this method allows me to modify the tinted windows of the car
     *
     * @param tintedWindows this is a type parameter String. tintedWindows  != null
     * @author Paola Osorio
     */
    public void setTintedWindows(boolean tintedWindows) {
        this.tintedWindows = tintedWindows;
    }

    /**
     * this method gives me the battery life of the car
     *
     * @return boolean batteryLife
     * @author Paola Osorio
     */
    public double getBatteryLife() {
        return batteryLife;
    }

    /**
     * this method allows me to modify the tinted windows of the car
     *
     * @param batteryLife this is a type parameter double. batteryLife  != null
     * @author Paola Osorio
     */
    public void setBatteryLife(double batteryLife) {

        this.batteryLife = batteryLife;
    }

    /**
     * this method gives me the type charge of the car
     *
     * @return String typeCharge
     * @author Paola Osorio
     */
    public String getTypeCharge() {
        return typeCharge;
    }

    /**
     * this method allows me to modify the type charge of the car
     *
     * @param typeCharge this is a type parameter String. typeCharge  != null
     * @author Paola Osorio
     */
    public void setTypeCharge(String typeCharge) {
        this.typeCharge = typeCharge;
    }

    /**
     * this method gives me the consume battery life of the car
     *
     * @return boolean consumeBattery
     * @author Paola Osorio
     */
    public double getConsumeBattery() {
        return consumeBattery;
    }

    /**
     * this method allows me to modify the consume battery of the car
     *
     * @param consumeBattery this is a type parameter double. consumeBattery  != null
     * @author Paola Osorio
     */
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
