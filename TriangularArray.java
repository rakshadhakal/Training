import java.util.Scanner;

public class TriangularArray {
    public static void main(String[] args) {
        int[][] tri = new int[4][];
        // leave size of 2nd dimensional empty to create irregular array
        tri[0] = new int[1]; // add 1D array of size 1 as first row
        tri[1] = new int[2]; // add 1d array of size 2 as second row.....
        tri[2] = new int[3];
        tri[3] = new int[4];
        // This way the array can have variable column size in individual row
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tri.length; i++) {
            for (int j = 0; i < tri[i].length; j++) {
                System.out.println("Enter element");
                tri[i][j] = sc.nextInt();
            }
        }
        // using enhanced for loop to access multidimensional array
        for (int[] arr : tri) {
            for (int e : arr) {
                System.out.print("\t" + e);
            }
            System.out.println();
        }
    }

}
