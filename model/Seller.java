package model;

import java.lang.ref.SoftReference;
import java.security.Signature;

public class Seller extends Person{

    private int totalSales;

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


}
