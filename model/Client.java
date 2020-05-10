package model;

public class Client extends Person{

    private String phoneNumber;
    private String email;

    public Client(String name, String lastName, String id, String phoneNumber, String email) {
        super(name, lastName,id);
        this.phoneNumber = phoneNumber;
        this.email=email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

}
