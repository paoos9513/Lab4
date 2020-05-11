package model;

public class MechanicalTechnician extends Document{

    public int gasLevel;

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
}
