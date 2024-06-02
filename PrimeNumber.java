import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false; // exact divisible by smaller number so not
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + "is a prime number");
        } else {
            System.out.println(num + "is not a prime number");
        }
    }

}
