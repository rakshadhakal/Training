public class ArithmeticOp {
    // Arithmetic operator operates upon number and result is also
    // a number:
    /*
     * symbol used are:
     * Additiom +
     * Substraction -
     * multiply *
     * division /
     * Module (Remainder) %
     */
    public static void main(String[] args) {
        byte b = 10;
        byte c = 20;
        // byte d = b+c; // the result of arithmetioc operation is integer if the
        // datatype involved
        // are smaller than integer , so we cannot assign the result in smaller type
        int d = b + c;
        int x = 20;
        int y = 30;
        System.out.println("The sum is " + x + y);
        System.out.println("The differnce is " + (x - y));
        System.out.println("The product is:" + (x * y));
        System.out.println("The divident is:" + (x / y));
        System.out.println("The module is:" + (y % x));

        // Relational operator
        // relational opearator operates upon numeric operands result is in boolean
        // value(true/false)
        System.out.println("X is greater than Y: " + (x > y));
        System.out.println("X is smaller than Y: " + (x < y));
        System.out.println("X is greater than equals to Y: " + (x >= y));
        System.out.println("X is smaller than equals to Y: " + (x <= y));
        System.out.println("X is equals to Y:" + (x == y));
        System.out.println("X is not equals to Y:" + (x != y));

    }
}
