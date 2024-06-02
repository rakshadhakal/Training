package com.rakshya.oop;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice i = new Invoice("123","hammer",2,9.99);
        System.out.println("Invoice Number: "+i.getPart_number());
        System.out.println("Part Description: "+i.getDescription());
        System.out.println("Quantity: "+i.getQuantity());
        System.out.println("Price Per Item:$ "+i.getPrice());
        System.out.println("Invoice Amount:$ "+i.getInvoiceAmount());

    }
}
