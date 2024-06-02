import java.util.Scanner;

public class NextPerfectSquare {
    // a program to find next number that is a kperfect square
    static boolean isPerfectSquare(int n) {
        // if(n==25)
        // return true;
        for (int i = 0; i <= n; i++) {
            if (i * i == n) {
                return true;

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n = sc.nextInt();
        while (!isPerfectSquare(n)) {
            n++;

        }
        System.out.println(n + " is perfect square");
    }

}
