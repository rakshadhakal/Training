public class LogicalOp {
    // &(AND) |(OR) !(NOT)
    // logical operator operats upon logical value true or false and produce a
    // result that is also a logical value
    public static void main(String[] args) {

        boolean b1 = true, b2 = false;
        System.out.println("AND operation: " + (b1 & b2)); // false
        System.out.println("OR operation : " + (b1 | b2)); // true
        System.out.println("Complement of b1 : " + !b1); // true ==> false

        int a = 10;
        int b = 15;
        System.out.println(" Is both the numbers are positive ?" + (a >= 0 && b >= 0)); // true & true = true
        System.out.println("Either a or b is an even number?" + ((a % 2 == 0) || (b % 2 == 0)));
        System.out.println("3 is not a factor of a? " + !(a % 3 == 0));

        // bitwise logical operator operatoes upon individual bits of an integer operand
        System.out.printf("%d and %d == %d \n", a, b, a & b);
        System.out.printf("%d | %d = %d \n", a, b, a | b);
        System.out.printf("%d ^ %d = %d \n", a, b, a ^ b); // ex-OR
        System.out.printf("~ %d = %d \n", a, ~a); // complement
    }

}
