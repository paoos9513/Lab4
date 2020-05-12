package model;

public class Vehicle {

    private String brand;
    private String model;
    private int basePrice;
    private int cylinder;
    private int totalPrice;
    private String typeFuel;
    private String owner;
    private String licensePlate;
    private boolean isUsed;


    public Vehicle(String brand, String model, int basePrice, int cylinder, String typeFuel,  String licensePlate, boolean isUsed) {
        this.brand = brand;
        this.model = model;
        this.cylinder = cylinder;
        this.typeFuel = typeFuel;
        this.licensePlate = licensePlate;
        this.isUsed = isUsed;
        this.basePrice = basePrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice=totalPrice;
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice=basePrice;
    }

    public int getBasePrice(){
        return basePrice;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setModel(String model) {
        this.model=model;
    }

    public  String getModel(){
        return model;
    }

    public int getCylinder(){
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

}
