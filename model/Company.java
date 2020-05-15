package model;

import java.util.ArrayList;

public class Company {
    //atributos
    private String name;
    private String nit;
    private double totalEarnings;
    private int salesNumber;
    private Seller[] arraySeller = new Seller[10];
    //-----------------------------------------Arraylist de clientes y vendedores---------------------------------------

    private ArrayList<Client> clients = new ArrayList<>();
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    //--------------------------------------------Metodo constructor----------------------------------------------------
    /**
     * this is the constructor method that allows me to give value to attributes
     *@author Paola Osorio
     */
    public Company(String name, String nit){

        //atributos
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

    /**
     * this is the method that adds me to the vehicles to the company
     * @param myVehicle this parameter is of type Vehicle. myVehicle != null
     *@author Paola Osorio
     */
    public void addVehicle(Vehicle myVehicle){

        this.vehicles.add(myVehicle);
    }

    //---------------------------------------Vehiculos existentes en la compañia----------------------------------------

    /**
     * this method has vehicles that are already registered with the company
     *@author Paola Osorio
     */
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
                false,
                0.0,
                158.0,
                "Rapida")
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
                true,
                1.0,
                160.0,
                "Normal")
        );

        vehicles.add(new Motorcycle("BMW",
                "2016",
                250000,
                1500,
                "Gasolina",
                "Sin Asignar",
                0,
                "Estandar",
                false,
                100.0)
        );

        vehicles.add(new Motorcycle("Motocross",
                "2016",
                200000,
                1500,
                "Gasolina",
                "CDR 90C",
                2000,
                "Deportiva",
                true,
                150.0)
        );

    }
    //---------------------------------------------asignar vehiculo al cliente------------------------------------------

    /**
     *This method allows me to assign the vehicles that the client is interested in
     *@param vehicle this is an array of type Vehicle arrayList. vehicle != null
     *@author Paola Osorio
     */
    public void addCarToClient(Vehicle vehicle) {
        for (int i = 0; i < clients.size(); i++){
            clients.get(i).addVehicle(vehicle);
        }
    }

    //---------------------------------------------Metodos get y set----------------------------------------------------

    /**
     * this method allows me to modify the name of the customer or the seller
     *@param name this is a type parameter String. name != null
     *@author Paola Osorio
     */
    public void setName(String name) {
        this.name=name;
    }

    /**
     *this method gives me the name of the customer or the seller
     *@return String name
     *@author Paola Osorio
     */
    public String getName(){
        return name;
    }

    /**
     * this method allows me to modify the nit of the company
     *@param nit this is a type parameter String. name != null
     *@author Paola Osorio
     */
    public void setNit(String nit) {
        this.nit=nit;
    }

    /**
     * this method gives me the nit of the company
     *@return String nit
     *@author Paola Osorio
     */
    public String getNit(){
        return nit;
    }

    /**
     * this method gives me the total earnings of the company
     *@return double totalEarning
     *@author Paola Osorio
     */
    public double getTotalEarnings(){
        return totalEarnings;
    }

    /**
     * this method gives me the sales number of the company
     *@return int salesNumber
     *@author Paola Osorio
     */
    public int getSalesNumber(){
        return salesNumber;
    }

    /**
     * this method gives me the clients of the company
     *@return ArrayList<Client> client
     *@author Paola Osorio
     */
    public ArrayList<Client> getClients() {
        return clients;
    }

    /**
     * this method allows me to modify the clients of the company
     *@param clients this is an array of type Client arrayList. clients != null
     *@author Paola Osorio
     */
    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    /**
     * this method allows me to modify the total earnings of the company
     *@param totalEarnings this is a type parameter double. totalEarnings != null
     *@author Paola Osorio
     */
    public void setTotalEarnings(double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    /**
     * this method allows me to modify the sales number of the company
     *@param salesNumber this is a type parameter int. salesNumber != null
     *@author Paola Osorio
     */
    public void setSalesNumber(int salesNumber) {
        this.salesNumber = salesNumber;
    }

    /**​
     * This method returns the ten sellers of the company.
     *@return an array != null of type Seller
     *@author Paola Osorio
     */
    public Seller[] getArraySeller() {
        return arraySeller;
    }

    /**
     * This method allows me to change the ten sellers of the company
     *@param arraySeller this parameter is an array type Seller . arraySeller != null
     *@author Paola Osorio
     */
    public void setArraySeller(Seller[] arraySeller) {
        this.arraySeller = arraySeller;
    }

    /**
     *This method returns the vehicles of the company
     *@return  vehicles this is an array of type Vehicle arrayList. vehicle != null
     *@author Paola Osorio
     */
    public ArrayList<Vehicle> getVehicles(){
        return vehicles;
    }

    /**
     * this method allows me to modify the vehicle of the company
     *@param vehicles this is an array of type Vehicle arrayList. vehicle != null
     *@author Paola Osorio
     */
    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

}



