package model;

public class Soat extends Document{

    public double coverageAccident;

    public Soat(double price, String year, int codeDocuments,double coverageAccident) {
        super(price, year, codeDocuments);
        this.coverageAccident=coverageAccident;
    }

    public double getCoverageAccident() {
        return coverageAccident;
    }

    public void setCoverageAccident(double coverageAccident) {
        this.coverageAccident = coverageAccident;
    }
}
