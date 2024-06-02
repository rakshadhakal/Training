import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        n = sc.nextInt();
        System.out.println("Enter no of subjects for each student:");
        m = sc.nextInt();
        int[][] marks = new int[n][m];
        // input marks
        for (int i = 0; i < n; i++) { // i used for select student
            System.out.println("Enter marks for student: " + (i + 1));
            for (int j = 0; j < m; j++) { // j select subject
                System.out.println("Marks[" + (i + 1) + "] [" + (j + 1) + "] = ");
                marks[i][j] = sc.nextInt();

            }
        }
        int total;
        // for heading
        for (int i = 0; i < m; i++) {
            String sub = String.format("%9s%d", "Subject", i);
            System.out.printf(sub);
        }
        System.out.printf("%10s\n", "Percentage");
        for (int i = 0; i < n; i++) {
            total = 0;
            for (int j = 0; j < m; j++) {
                total = total + marks[i][j];
                System.out.printf("%10d", marks[i][j]);
            }
            System.out.printf("%10.2f %%", (double) total / m);
            System.out.println();
        }
    }

}
