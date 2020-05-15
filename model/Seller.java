package model;

import java.lang.ref.SoftReference;
import java.security.Signature;
import java.util.ArrayList;

public class Seller extends Person{

    //atributos
    private int totalSales;
    private ArrayList<Client> clients = new ArrayList<>();

    /**
     * this is the constructor method that allows me to give value to attributes
     *@author Paola Osorio
     */
    public Seller(String name, String lastName, String id, int totalSales) {
        super(name, lastName,id);
        this.totalSales = totalSales;
    }

    /**
     * this method checks me if the seller can add another customer
     *@param client this is a type parameter Client. client != null
     *@author Paola Osorio
     */
    public void addClient (Client client) {
        if(clients.size()<=5) {
            clients.add(client);
        }
    }

    /**
     * this method checks me if the seller can add another customer
     *@return boolean clients
     *@author Paola Osorio
     */
    public boolean canAddClients() {
        return clients.size()<=5;
    }

    /**
     * this method allows me to modify the total sales of the sellers
     *@param totalSales this is a type parameter int. totalSale != null
     *@author Paola Osorio
     */
    public void setTotalSales(int totalSales){
        this.totalSales=totalSales;
    }

    /**
     * this method gives me the total sales of the sellers
     *@return int totalSales
     *@author Paola Osorio
     */
    public int getTotalSales(){
        return totalSales;
    }


    /**
     * this method gives me the clients of that have the seller
     *@return ArrayList<Client> client
     *@author Paola Osorio
     */
    public ArrayList<Client> getClients() {
        return clients;
    }

    /**
     * this method allows me to modify the clients of the seller
     *@param clients this is an array of type Client arrayList. clients != null
     *@author Paola Osorio
     */
    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}
