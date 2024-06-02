package com.rakshya.exception;

public class OnlineShoping {

    public  String productName;
    public int quantity;

    public void order(int order_quantity){
        if(order_quantity >=quantity){  //order quantity more than quantity in stock
            throw new ProductOutOfStockException("The order quantity:" +order_quantity+" is not in stock");
        }
        //order-quantity is sufficient so order is a success
        quantity = order_quantity;
        System.out.println("Order successfully placed");
    }

    public static void main(String[] args) {
        OnlineShoping os = new OnlineShoping();
        os.productName="Jeans";
        os.quantity=20;
        try {
            os.order(10);  //success
        }catch (Exception e){
            System.out.println(e);
        }//handling each order seperately.....
        try {
            os.order(15);   //throws exception
        }catch (Exception e){
            System.out.println(e);
        }  //handling each order seperately.....
        try {
            os.order(5);
        }catch (Exception e){
            System.out.println(e);
        }//handling each order seperately.....
    }
}
