package model;

public class MechanicalTechnician extends Document{

    public int gasLevel;
    private int[][] codeMechanicalTechnician =new int[4][4];

    public MechanicalTechnician(double price, String year, int codeDocuments,int gasLevel) {
        super(price, year, codeDocuments);
        this.gasLevel=gasLevel;
    }

    public int getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(int gasLevel) {
        this.gasLevel = gasLevel;
    }

    public void setCodeMechanicalTechnician(){

        codeMechanicalTechnician[0][0]=3;
        codeMechanicalTechnician[0][1]=0;
        codeMechanicalTechnician[0][2]=9;
        codeMechanicalTechnician[0][3]=33;

        codeMechanicalTechnician[1][0]=4;
        codeMechanicalTechnician[1][1]=7;
        codeMechanicalTechnician[1][2]=11;
        codeMechanicalTechnician[1][3]=2;

        codeMechanicalTechnician[2][0]=3;
        codeMechanicalTechnician[2][1]=17;
        codeMechanicalTechnician[2][2]=8;
        codeMechanicalTechnician[2][3]=1;

        codeMechanicalTechnician[3][0]=12;
        codeMechanicalTechnician[3][1]=13;
        codeMechanicalTechnician[3][2]=1;
        codeMechanicalTechnician[3][3]=6;

    }
}
