import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        int num;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        int rev = 0, digit;
        while (num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10; // remove the last digit
            count++; // increment the count to identity removed last digit

        }
        System.out.println("The no . digits is :" + count);
        System.out.println("Reverse is : " + rev);
    }

}
