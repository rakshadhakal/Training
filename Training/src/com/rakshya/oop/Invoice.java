package com.rakshya.oop;

public class Invoice {
    private String part_number;
    private String description;
    private int quantity;
    private double price;
    public Invoice(String part_number , String description , int quantity, double price){
        this.part_number=part_number;
        this.description=description;
        this.quantity=quantity;
        this.price=price;
    }


    public String getPart_number(){
        return part_number;
    }
    public void setPart_number(String part_number){
        this.part_number=part_number;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public double getInvoiceAmount(){
        double invoice_amount=quantity*price;
        return invoice_amount;
    }
}
