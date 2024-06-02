public class NestedFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // outer loop repeat 5 times
            for (int j = 1; j <= 5; j++) {
                // inner loop repeat 5 times for each step of outer loop
                System.out.println("*");
            }
        }

        // pattern generate
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("*\t"); // prints value in same line
            }
            System.out.println();
        }
        // traingular pattern
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
