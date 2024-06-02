public class ConditionalOp {
    // conditional operator also known as ternary operator has three
    // parts/expressions
    // First expression should be a condition check or a boolean value
    // if the first expression is true then second expression is executed and result
    // is returned
    // else the third expression is executed and the result is returned
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println("Max is: " + max);
        String larger = a > b ? "A is larger than B" : "B is larger than A ";
        int c = 30;
        // nested conditional operation
        // find the max of a , b and c
        max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The max of three value is " + max);

        long l = 2344567754876L;
        float f = 234.5433f;
        double d = 12.234567898765432e15;
        double result = a * b - c / d + (f / l + d);
        System.out.println("Result is :" + result);
        // the result of such expression is converted to the biggest data type in that
        // expresion

    }

}
