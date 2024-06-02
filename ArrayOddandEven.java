//input an array of 10 elements now split those array element in even and odd array then display even array and odd array separately.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOddandEven {
    public static void main(String[] args) {
        // input a regular array of size 10
        int[] arr = new int[10];
        int[] odd, even;
        int evenCount = 0, oddCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element");
        for (int i = 0; i < 10; i++) {
            System.out.println("Arr[" + i + "] =");
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        // now we create even and odd aarays with dynamic initilization
        // when we know the size of those array
        even = new int[evenCount];
        odd = new int[oddCount];
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {// place even elements in even array
                even[--evenCount] = arr[i];
            } else { // oe else place odd elements in odd array
                odd[--oddCount] = arr[i];
            }
            System.out.println("Original Array:");
            System.out.println(Arrays.toString(arr));
            System.out.println("Even Array:");
            System.out.println(Arrays.toString(even));
            System.out.println("Odd Array:");
            System.out.println(Arrays.toString(odd));

        }

    }
}
