package model;

/**
 * The type Mechanical technician.
 */
public class MechanicalTechnician extends Document{
    /**
     * The Gas level.
     */
//atributos
    public int gasLevel;

    /**
     * this is the constructor method that allows me to give value to attributes
     *
     * @param price         the price
     * @param year          the year
     * @param codeDocuments the code documents
     * @param gasLevel      the gas level
     * @author Paola Osorio
     */
    public MechanicalTechnician(double price, int year, int codeDocuments, int gasLevel) {
        super(price, year, codeDocuments);
        this.gasLevel=gasLevel;
    }

    /**
     * this method gives me the gas level of a vehicle
     *
     * @return int gasLevel
     * @author Paola Osorio
     */
    public int getGasLevel() {
        return gasLevel;
    }

    /**
     * this method allows me to modify the gas level of a vehicle
     *
     * @param gasLevel this is a type parameter int. gasLevel != null
     * @author Paola Osorio
     */
    public void setGasLevel(int gasLevel) {
        this.gasLevel = gasLevel;
    }

}
