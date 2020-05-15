package model;

public class Motorcycle extends Vehicle{
    //atributos
    private int kilometers;
    private String typeMotorcycle;

    /**
     * this is the constructor method that allows me to give value to attributes
     *@author Paola Osorio
     */
    public Motorcycle(String brand, String model, int basePrice, int cylinder, String typeFuel,  String licensePlate, int kilometers, String typeMotorcycle, boolean isUsed,double tankCapacity) {
        super(brand, model, basePrice, cylinder, typeFuel,  licensePlate, isUsed, tankCapacity);
        this.kilometers = kilometers;
        this.typeMotorcycle = typeMotorcycle;
    }

    /**
     *this method gives me the kilometers of the motorcycle
     *@return int kilometers
     *@author Paola Osorio
     */
    public int getKilometers() {
        return kilometers;
    }

    /**
     * this method allows me to modify the kilometers of the motorcycle
     *@param kilometers this is a type parameter int. kilometers != null
     *@author Paola Osorio
     */
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    /**
     *this method gives me the type of motorcycle
     *@return String typeMotorcycle
     *@author Paola Osorio
     */
    public String getTypeMotorcycle() {
        return typeMotorcycle;
    }

    /**
     * this method allows me to modify the type motorcycle
     *@param typeMotorcycle this is a type parameter String. typeMotorcycle != null
     *@author Paola Osorio
     */
    public void setTypeMotorcycle(String typeMotorcycle) {
        this.typeMotorcycle = typeMotorcycle;
    }



}
