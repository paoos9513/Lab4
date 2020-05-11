package model;

public class Document {

    private double price;
    private String year;
    private int codeDocuments;

    public Document(double price, String year, int codeDocuments) {

        this.price = price;
        this.year = year;
        this.codeDocuments = codeDocuments;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getCodeDocuments() {
        return codeDocuments;
    }

    public void setCodeDocuments(int codeDocuments) {
        this.codeDocuments = codeDocuments;
    }
}
