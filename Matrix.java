import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix element:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; i < 2; j++) {
                System.out.println("Matrix [" + i + "] [" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }

        }
        for (int[] ar : matrix) {
            for (int a : ar) {
                System.out.println(a + "\t");
            }
            System.out.println();
        }
    }

}
