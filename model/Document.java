package model;

/**
 * The type Document.
 */
public class Document {

    //atributos
    private double price;
    private int year;

    private int codeDocuments;
    private int numbers = (int)(Math.random()*100);
    private int[][] codeMechanicalTechnician =new int[4][4];
    private int[][] codeSoat =new int[4][4];

    /**
     * this is the constructor method that allows me to give value to attributes
     *
     * @param price         the price
     * @param year          the year
     * @param codeDocuments the code documents
     * @author Paola Osorio
     */
    public Document(double price, int year, int codeDocuments) {

        this.price = price;
        this.year = year;
        this.codeDocuments = codeDocuments;
    }

    /**
     * this method gives me the price of the SOAT or technician mechanical
     *
     * @return double price
     * @author Paola Osorio
     */
    public double getPrice() {
        return price;
    }

    /**
     * this method allows me to modify the price the SOAT or technician mechanical
     *
     * @param price this is a type parameter double. price != null
     * @author Paola Osorio
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * this method gives me the year of the SOAT or technician mechanical
     *
     * @return int year
     * @author Paola Osorio
     */
    public int getYear() {
        return year;
    }

    /**
     * this method allows me to modify the year the SOAT or technician mechanical
     *
     * @param year this is a type parameter int. year != null
     * @author Paola Osorio
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * this method gives me the code of the SOAT or technician mechanical
     *
     * @return int codeDocuments
     * @author Paola Osorio
     */
    public int getCodeDocuments() {
        return codeDocuments;
    }

    /**
     * this method gives me the numbers random of the SOAT or technician mechanical
     *
     * @return int numbers
     * @author Paola Osorio
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * this method allows me to modify the number random the SOAT or technician mechanical
     *
     * @param numbers this is a type parameter int. numbers != null
     * @author Paola Osorio
     */
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }


    /**
     * Get code mechanical technician int [ ] [ ].
     *
     * @return the int [ ] [ ]
     */
    public int[][] getCodeMechanicalTechnician() {
        return codeMechanicalTechnician;
    }

    /**
     * Sets code mechanical technician.
     *
     * @param codeMechanicalTechnician the code mechanical technician
     */
    public void setCodeMechanicalTechnician(int[][] codeMechanicalTechnician) {
        this.codeMechanicalTechnician = codeMechanicalTechnician;
    }


    /**
     * Get code soat int [ ] [ ].
     *
     * @return the int [ ] [ ]
     */
    public int[][] getCodeSoat() {
        return codeSoat;
    }

    /**
     * Sets code soat.
     *
     * @param codeSoat the code soat
     */
    public void setCodeSoat(int[][] codeSoat) {
        this.codeSoat = codeSoat;
    }

    /**
     * this method allows me to modify the code Documents the SOAT or technician mechanical
     *
     * @param codeDocuments this is a type parameter int. codeDocuments != null
     * @author Paola Osorio
     */
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