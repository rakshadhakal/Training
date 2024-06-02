public class FibonammiSeries {
    // generate a fibonacci series uoto 10 terms
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        // generate next term
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            System.out.println(c);
            // prepare for next iteration
            a = b;
            b = c;
        }
    }

}
