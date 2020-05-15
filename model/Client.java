package model;

import java.util.ArrayList;

public class Client extends Person{
    //atributos
    private String phoneNumber;
    private String email;
    //arrayList de vehivulos
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    /**
     * this is the constructor method that allows me to give value to attributes
     *@author Paola Osorio
     */
    public Client(String name, String lastName, String id, String phoneNumber, String email) {
        super(name, lastName,id);
        this.phoneNumber = phoneNumber;
        this.email=email;
    }

    /**
     * this is the method that adds me to the vehicles to a client
     * @param vehicle this parameter is of type Vehicle. Vehicle != null
     *@author Paola Osorio
     */
    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }


    /**
     * this method allows me to modify the phone number of a client
     *@param  phoneNumber this is a type parameter String. phoneNumber != null
     *@author Paola Osorio
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }

    /**
     *this method gives me the phone number of the client
     *@return String phoneNumber
     *@author Paola Osorio
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * this method gives me the vehicle of a client
     *@return ArrayList<Vehicle> vehicles
     *@author Paola Osorio
     */
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    /**
     *this method gives me the email of the client
     *@return String email
     *@author Paola Osorio
     */
    public String getEmail() {
        return email;
    }

    /**
     * this method allows me to modify the email of a client
     *@param email this is a type parameter String. email != null
     *@author Paola Osorio
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * this method allows me to modify the vehicles of the client
     *@param vehicles this is an array of type Vehicle arrayList. vehicle != null
     *@author Paola Osorio
     */
    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
