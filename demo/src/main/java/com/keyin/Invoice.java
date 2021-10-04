package com.keyin;

public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    Invoice(String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID(){
        return this.id;
    }

    public String getDesc(){
        return this.desc;
    }

    public int getQty(){
        return this.qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public double getUnitPrice(){
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return(
            this.unitPrice*this.qty
        );
    }

    public String toString(){
        return(
            "Invoice[id="+getID()+",desc="+getDesc()+",qty="+getQty()+",unitPrice="+getUnitPrice()+"]"
        );
    }
}

