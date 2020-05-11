package model;

import java.util.ArrayList;

public class Company {

    private String name;
    private String nit;
    private double totalEarnings;
    private int salesNumber;
    private Seller[] arraySeller = new Seller[10];
    //-----------------------------------------Arraylist de clientes y vendedores---------------------------------------

    private ArrayList<Client> clients = new ArrayList<>();
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    //--------------------------------------------Metodo constructor----------------------------------------------------

    public Company(String name, String nit){

        this.name=name;
        this.nit=nit;

    //-------------------------------------------Arreglo de vendedores--------------------------------------------------

        arraySeller[0] = new Seller("Anderson","Rueda","1123343",0);
        arraySeller[1] = new Seller("Fredy","Osorio","1123453",0);
        arraySeller[2] = new Seller("Sara","Escobar","12435443",0);
        arraySeller[3] = new Seller("Jhon","Osorio","1242343",0);
        arraySeller[4] = new Seller("Fabiola","Holguin","35334343",0);
        arraySeller[5] = new Seller("Mario","Escobar","34334343",0);
        arraySeller[6] = new Seller("Stefa","Oviedo","13431343",0);
        arraySeller[7] = new Seller("Leidy","Osorio","1353343",0);
        arraySeller[8] = new Seller("Camilo","Cordoba","2443343",0);
        arraySeller[9] = new Seller("Joe","Elmejor","134123343",0);

        initVehicles();
    }
    //--------------------------------------------Metodo para agregar vehiculos-----------------------------------------

    public void addVehicle(Vehicle myVehicle){

        this.vehicles.add(myVehicle);
    }

    //---------------------------------------Vehiculos existentes en la compañia----------------------------------------
    public void initVehicles(){

        vehicles.add(new Car("Mazda",
                "2020",
                230000,
                2000,
                "Electrico",
                "Sin asignar",
                0,
                5,
                "Camioneta",
                true,
                false)
        );

        vehicles.add(new Car("Toyota",
                "2019",
                550000,
                2500,
                "Hibrido",
                "VCR 456",
                30000,
                5,
                "Camioneta",
                false,
                true)
        );

        vehicles.add(new Motorcycle("BMW",
                "2016",
                250000,
                1500,
                "Gasolina",
                "Sin Asignar",
                0,
                "Estandar",
                false)
        );

        vehicles.add(new Motorcycle("Motocross",
                "2016",
                200000,
                1500,
                "Gasolina",
                "CDR 90C",
                2000,
                "Deportiva",
                true)
        );

    }

    public void addCarToClient(Vehicle vehicle) {
        for (int i = 0; i < clients.size(); i++){
            clients.get(i).addVehicle(vehicle);
        }
    }

    //---------------------------------------------Metodos get y set----------------------------------------------------
    public void setName(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setNit(String nit) {
        this.nit=nit;
    }

    public String getNit(){
        return nit;
    }

    public double getTotalEarnings(){
        return totalEarnings;
    }

    public int getSalesNumber(){
        return salesNumber;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void setTotalEarnings(double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    public void setSalesNumber(int salesNumber) {
        this.salesNumber = salesNumber;
    }

    public Seller[] getArraySeller() {
        return arraySeller;
    }

    public void setArraySeller(Seller[] arraySeller) {
        this.arraySeller = arraySeller;
    }

    public ArrayList<Vehicle> getVehicles(){
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}



