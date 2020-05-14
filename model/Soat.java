package model;

public class Soat extends Document{

    private double coverageAccident;


    public Soat(double price, int year, int codeDocuments, double coverageAccident) {
        super(price, year, codeDocuments);
        this.coverageAccident=coverageAccident;
    }

    public double getCoverageAccident() {
        return coverageAccident;
    }

    public void setCoverageAccident(double coverageAccident) {
        this.coverageAccident = coverageAccident;
    }

    public void setCodeSoat(){




    }
}
