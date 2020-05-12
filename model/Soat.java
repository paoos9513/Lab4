package model;

public class Soat extends Document{

    private double coverageAccident;
    private int[][] codeSoat =new int[4][4];

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

    public void setCodeSoat(){

        codeSoat[0][0]=1;
        codeSoat[0][1]=9;
        codeSoat[0][2]=8;
        codeSoat[0][3]=0;

        codeSoat[1][0]=3;
        codeSoat[1][1]=11;
        codeSoat[1][2]=2;
        codeSoat[1][3]=5;

        codeSoat[2][0]=4;
        codeSoat[2][1]=21;
        codeSoat[2][2]=6;
        codeSoat[2][3]=22;

        codeSoat[3][0]=12;
        codeSoat[3][1]=4;
        codeSoat[3][2]=6;
        codeSoat[3][3]=1;


    }
}
