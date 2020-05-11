package model;

import java.util.ArrayList;

public class Client extends Person{

    private String phoneNumber;
    private String email;
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    public Client(String name, String lastName, String id, String phoneNumber, String email) {
        super(name, lastName,id);
        this.phoneNumber = phoneNumber;
        this.email=email;
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }


}
