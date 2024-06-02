public class ForDemo {
    public static void main(String[] args) {
        // a program to count from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // a program to display 2 times of a number
        int c = 1;
        for (;;) {
            System.out.println(2 * c);
            if (c == 10)
                break; // break terminates the loop
            c++;
        }

    }

}
