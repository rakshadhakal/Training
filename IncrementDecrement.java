public class IncrementDecrement {
    /*
     * Increment/Decrement operator is used to increase or decrease the value of a
     * integral variable by 1
     * Symbole used is ++ or --,It has two forms
     * 1. Prefix : eg: ++a increment first before any other operation on that
     * statement
     * 2. Postfix: eg: a++ increments last after every other opertaion on that
     * statement
     */
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Value of a: " + a);
        System.out.println("During postfix : " + a++); // shows same value
        System.out.println("After postfix: " + a); // shows updated value
        // During the execution of statement with postfix operator, the postfix is
        // performed after the result has been
        // and just before moving on the next statement
        System.out.println(a++ + ++a); // 11+13=24
        a = 10;
        System.out.println("Before prefix: " + a);
        System.out.println("During prefix: " + ++a);
        a = Integer.MAX_VALUE; // maximum value integer range
        System.out.println("Value of a: " + a);
        a++;
        System.out.println("Value after overflow: " + a); // minimum value of integer range
    }

}
