package model;

import javax.print.Doc;

public class Vehicle {

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
    private double consumeFuel;

    /**
     * this is the constructor method that allows me to give value to attributes
     *@author: Paola Osorio
     */
    public Vehicle(String brand, String model, int basePrice, int cylinder, String typeFuel,  String licensePlate, boolean isUsed,double tankCapacity) {
        this.brand = brand;
        this.model = model;
        this.cylinder = cylinder;
        this.typeFuel = typeFuel;
        this.licensePlate = licensePlate;
        this.isUsed = isUsed;
        this.basePrice = basePrice;
        this.tankCapacity=tankCapacity;
    }

    /**
     * this method allows me to modify the total price of a vehicle
     *@param totalPrice this is a type parameter double. totalPrice != null
     *@author: Paola Osorio
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice=totalPrice;
    }

    /**
     * this method gives me the total price of a vehicle
     *@return double totalPrice
     *@author: Paola Osorio
     */
    public double getTotalPrice(){
        return totalPrice;
    }

    /**
     * this method allows me to modify the price base of a vehicle
     *@param basePrice this is a type parameter int. basePrice != null
     *@author: Paola Osorio
     */
    public void setBasePrice(int basePrice) {
        this.basePrice=basePrice;
    }

    /**
     * this method gives me the price base of a vehicle
     *@return int basePrice
     *@author: Paola Osorio
     */
    public int getBasePrice(){
        return basePrice;
    }

    /**
     * this method allows me to modify the brand of a vehicle
     *@param brand this is a type parameter String. brand != null
     *@author: Paola Osorio
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * this method gives me the total price of a vehicle
     *@return String brand
     *@author: Paola Osorio
     */
    public String getBrand(){
        return brand;
    }

    /**
     * this method allows me to modify the model of a vehicle
     *@param model is a type parameter String. model != null
     *@author: Paola Osorio
     */
    public void setModel(String model) {
        this.model=model;
    }

    /**
     * this method gives me the model of a vehicle
     *@return String model
     *@author: Paola Osorio
     */
    public  String getModel(){
        return model;
    }

    /**
     * this method gives me the cylinder of a vehicle
     *@return double cylinder
     *@author: Paola Osorio
     */
    public double getCylinder(){
        return cylinder;
    }

    /**
     * this method allows me to modify the cylinder of a vehicle
     *@param cylinder this is a type parameter double. cylinder != null
     *@author: Paola Osorio
     */
    public void setCylinder(double cylinder) {
        this.cylinder = cylinder;
    }

    /**
     * this method gives me the owner of a vehicle
     *@return String owner
     *@author: Paola Osorio
     */
    public String getOwner() {
        return owner;
    }

    /**
     * this method allows me to modify the owner of a vehicle
     *@param owner this is a type parameter String. owner != null
     *@author: Paola Osorio
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * this method gives me the type fuel of a vehicle
     *@return String typeFuel
     *@author: Paola Osorio
     */
    public String getTypeFuel() {
        return typeFuel;
    }

    /**
     * this method allows me to modify the type fuel of a vehicle
     *@param typeFuel this is a type parameter String. typeFuel != null
     *@author: Paola Osorio
     */
    public void setTypeFuel(String typeFuel) {

        this.typeFuel = typeFuel;
    }

    /**
     * this method gives me the license plate of a vehicle
     *@return String licensePlate
     *@author: Paola Osorio
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * this method allows me to modify the license plate of a vehicle
     *@param licensePlate this is a type parameter String. licensePlate != null
     *@author: Paola Osorio
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * this method gives me about vehicle is used or new
     *@return boolean isUsed
     *@author: Paola Osorio
     */
    public boolean isUsed() {
        return isUsed;
    }

    /**
     * this method allows me to modify about vehicle is used or new
     *@param used this is a type parameter boolean. used != null
     *@author: Paola Osorio
     */
    public void setUsed(boolean used) {
        isUsed = used;
    }

    /**
     * this method gives me the tank capacity of a vehicle
     *@return double tankCapacity
     *@author: Paola Osorio
     */
    public double getTankCapacity() {
        return tankCapacity;
    }

    /**
     * this method allows me to modify the thank capacity of a vehicle
     *@param tankCapacity this is a type parameter double. tankCapacity != null
     *@author: Paola Osorio
     */
    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    /**
     * this method gives me the consume fuel of a vehicle
     *@return double consumeFuel
     *@author: Paola Osorio
     */
    public double getConsumeFuel() {
        return consumeFuel;
    }

    /**
     * this method allows me to modify the calculate price total of a vehicle
     *@author: Paola Osorio
     */

    public void calculatePriceTotal(){
        //para carro usado



       if(isUsed){

           double discount = (totalPrice - (totalPrice * 0.1));

           if (typeFuel.equalsIgnoreCase("electrico")) {

               this.totalPrice = (basePrice - discount + (basePrice * 0.20));

           }else if(typeFuel.equalsIgnoreCase("hibrido")){

               this.totalPrice = (basePrice - discount + (basePrice * 0.15));

           }else{
               this.totalPrice= (basePrice-discount);
           }

       }else {
           //para carro nuevo
           if (typeFuel.equalsIgnoreCase("electrico")) {

               this.totalPrice = (basePrice + (basePrice * 0.20));

           }else if(typeFuel.equalsIgnoreCase("hibrido")){

               this.totalPrice = (basePrice + (basePrice * 0.15));

           }else{
               this.totalPrice= (basePrice);
           }

       }

       //para moto usado
        if(isUsed){

            this.totalPrice= (basePrice+(totalPrice*0.02));

        }else {
            //para carro nuevo

                this.totalPrice= (basePrice+(totalPrice*0.04));
        }

    }

    /**
     * this method allows me to modify the cosume fuel of a vehicle
     *@param consumeFuel this is a type parameter double. consumeFuel != null
     *@author: Paola Osorio
     */
    public void setConsumeFuel(double consumeFuel){


        // si es carro


        if(getTypeFuel().equalsIgnoreCase("gasolina")){

           this.consumeFuel = (tankCapacity*(cylinder/100));

        }else if(getTypeFuel().equalsIgnoreCase("hibrido")){

            this.consumeFuel = (tankCapacity*(cylinder/110));

        }

        //para moto

        if (getTypeFuel().equalsIgnoreCase("gasolina")){

            this.consumeFuel = (tankCapacity*(cylinder/90));
        }

    }



}


