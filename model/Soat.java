package model;

public class Soat extends Document{
    //Atributos
    private double coverageAccident;

    /**
     * this is the constructor method that allows me to give value to attributes
     *@author Paola Osorio
     */
    public Soat(double price, int year, int codeDocuments, double coverageAccident) {
        super(price, year, codeDocuments);
        this.coverageAccident=coverageAccident;
    }

    /**
     * this method gives me the coverage Accident of a vehicle
     *@return double coverageAccident
     *@author Paola Osorio
     */
    public double getCoverageAccident() {
        return coverageAccident;
    }

    /**
     * this method allows me to modify the coverage accident of a vehicle
     *@param coverageAccident this is a type parameter double. coverageAccident != null
     *@author Paola Osorio
     */
    public void setCoverageAccident(double coverageAccident) {
        this.coverageAccident = coverageAccident;
    }

    /**
     * this method allows me to modify the code of the SOAT of a vehicle
     *@author Paola Osorio
     */
    public void setCodeSoat(){


    }
}
