package model;

public class MechanicalTechnician extends Document{
    //atributos
    public int gasLevel;
    /**
     * this is the constructor method that allows me to give value to attributes
     *@author: Paola Osorio
     */
    public MechanicalTechnician(double price, int year, int codeDocuments, int gasLevel) {
        super(price, year, codeDocuments);
        this.gasLevel=gasLevel;
    }

    /**
     * this method gives me the gas level of a vehicle
     *@return int gasLevel
     *@author: Paola Osorio
     */
    public int getGasLevel() {
        return gasLevel;
    }

    /**
     * this method allows me to modify the gas level of a vehicle
     *@param gasLevel this is a type parameter int. gasLevel != null
     *@author: Paola Osorio
     */
    public void setGasLevel(int gasLevel) {
        this.gasLevel = gasLevel;
    }

}
