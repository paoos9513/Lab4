package model;

import javax.print.Doc;

public class Vehicle {

    Document document;
    private String brand;
    private String model;
    private int basePrice;
    private double cylinder;
    private double totalPrice;
    private String typeFuel;
    private String owner;
    private String licensePlate;
    private boolean isUsed;
    private double tankCapacity;



    public Vehicle(String brand, String model, int basePrice, int cylinder, String typeFuel,  String licensePlate, boolean isUsed,double tankCapacity) {
        this.brand = brand;
        this.model = model;
        this.cylinder = cylinder;
        this.typeFuel = typeFuel;
        this.licensePlate = licensePlate;
        this.isUsed = isUsed;
        this.basePrice = basePrice;
        this.tankCapacity=tankCapacity;
        document = new Document(39000,2020, 0);
    }

    public void setTotalPrice(double totalPrice) {

        this.totalPrice=totalPrice;
    }

    public double getTotalPrice(){
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

    public double getCylinder(){
        return cylinder;
    }

    public void setCylinder(double cylinder) {
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

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }



    public void calculatePriceTotal(){
        //para carro usado

       if(isUsed){

           double discount = (totalPrice - (totalPrice * 0.1));

           if (typeFuel.equalsIgnoreCase("electrico")) {

               totalPrice = (basePrice - discount + (basePrice * 0.20));

           }else if(typeFuel.equalsIgnoreCase("hibrido")){

               totalPrice = (basePrice - discount + (basePrice * 0.15));

           }else{
               totalPrice= (basePrice-discount);
           }

       }else {
           //para carro nuevo
           if (typeFuel.equalsIgnoreCase("electrico")) {

               totalPrice = (basePrice + (basePrice * 0.20));

           }else if(typeFuel.equalsIgnoreCase("hibrido")){

               totalPrice = (basePrice + (basePrice * 0.15));

           }else{
               totalPrice= (basePrice);
           }

       }

       //para moto usada
        if(isUsed){

            totalPrice= (basePrice+(totalPrice*0.02));

        }else {
            //para carro nuevo

                totalPrice= (basePrice+(totalPrice*0.04));
        }



    }

    public void consumeFuel(){

        double consumeFuel;

        // si es carro


        if(getTypeFuel().equalsIgnoreCase("gasolina")){

           consumeFuel = (tankCapacity*(cylinder/100));

        }else if(getTypeFuel().equalsIgnoreCase("hibrido")){

            consumeFuel = (tankCapacity*(cylinder/110));

        }

        //para moto

        if (getTypeFuel().equalsIgnoreCase("gasolina")){

            consumeFuel = (tankCapacity*(cylinder/90));
        }

    }



}


