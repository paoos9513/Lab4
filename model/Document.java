package model;

public class Document {


    private double price;
    private int year;

    private int codeDocuments;
    private int numbers = (int)(Math.random()*100);
    private int[][] codeMechanicalTechnician =new int[4][4];
    private int[][] codeSoat =new int[4][4];

    public Document(double price, int year, int codeDocuments) {

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCodeDocuments() {
        return codeDocuments;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public int[][] getCodeMechanicalTechnician() {
        return codeMechanicalTechnician;
    }

    public void setCodeMechanicalTechnician(int[][] codeMechanicalTechnician) {
        this.codeMechanicalTechnician = codeMechanicalTechnician;
    }

    public int[][] getCodeSoat() {
        return codeSoat;
    }

    public void setCodeSoat(int[][] codeSoat) {
        this.codeSoat = codeSoat;
    }

    public void setCodeDocuments(int codeDocuments) {

        this.codeDocuments = codeDocuments;

        //generar codigo de soat
        codeSoat[0][0]=numbers;
        codeSoat[0][1]=numbers;
        codeSoat[0][2]=numbers;
        codeSoat[0][3]=numbers;

        codeSoat[1][0]=numbers;
        codeSoat[1][1]=numbers;
        codeSoat[1][2]=numbers;
        codeSoat[1][3]=numbers;

        codeSoat[2][0]=numbers;
        codeSoat[2][1]=numbers;
        codeSoat[2][2]=numbers;
        codeSoat[2][3]=numbers;

        codeSoat[3][0]=numbers;
        codeSoat[3][1]=numbers;
        codeSoat[3][2]=numbers;
        codeSoat[3][3]=numbers;



        //generar codigo de tecnico mecanico
        codeMechanicalTechnician[0][0]=numbers;
        codeMechanicalTechnician[0][1]=numbers;
        codeMechanicalTechnician[0][2]=numbers;
        codeMechanicalTechnician[0][3]=numbers;

        codeMechanicalTechnician[1][0]=numbers;
        codeMechanicalTechnician[1][1]=numbers;
        codeMechanicalTechnician[1][2]=numbers;
        codeMechanicalTechnician[1][3]=numbers;

        codeMechanicalTechnician[2][0]=numbers;
        codeMechanicalTechnician[2][1]=numbers;
        codeMechanicalTechnician[2][2]=numbers;
        codeMechanicalTechnician[2][3]=numbers;

        codeMechanicalTechnician[3][0]=numbers;
        codeMechanicalTechnician[3][1]=numbers;
        codeMechanicalTechnician[3][2]=numbers;
        codeMechanicalTechnician[3][3]=numbers;



    }
}
