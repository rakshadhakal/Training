
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        // statically declare array
        int[] arr = { 1, 9, 7, 5, 3, 8, 6 };
        // array sorting
        int temp, i, j;
        for (i = 0; i < arr.length; i++) { // repeat bubble sort i times
            for (j = i + 1; j < arr.length; j++) { // compare and sort adjacent element
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));

    }

}
