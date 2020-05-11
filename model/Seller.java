package model;

import java.lang.ref.SoftReference;
import java.security.Signature;
import java.util.ArrayList;

public class Seller extends Person{

    private int totalSales;
    private ArrayList<Client> clients = new ArrayList<>();

    public Seller(String name, String lastName, String id, int totalSales) {
        super(name, lastName,id);
        this.totalSales = totalSales;
    }

    public void setTotalSales(int totalSales){
        this.totalSales=totalSales;
    }

    public int getTotalSales(){
        return totalSales;
    }

    public void addClient (Client client) {
        if(clients.size()<=5) {
            clients.add(client);
        }
    }

    public boolean canAddClients() {
        return clients.size()<=5;
    }


    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}
