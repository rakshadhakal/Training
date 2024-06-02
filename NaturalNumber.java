import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        // Input 10 numbers and find the sum of those numbers
        int sum = 0;
        int data;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("Enter Input " + i + ":");
            data = sc.nextInt();
            // sum +=data;
            sum += data;

            if (max < data) {
                max = data; // replace max if it is smaller
            }

            if (min > data) {
                min = data; // replaces min if it is largest
            }
        }
        System.out.println("The sum of 10 input values is " + sum);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
    }

}
