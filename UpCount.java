public class UpCount {
    public static void main(String[] args) {

        int prev_sum = 0, next_sum, upcount = 0;
        int[] arr = { 2, 3, 1, -6, 8, -3, -1, 2 };
        int n = 5;
        // calculate 5-upcount
        for (int i = 0; i < arr.length; i++) {
            next_sum = prev_sum + arr[i];
            if (prev_sum <= n && next_sum > n) {
                // 5 crossing from smaller to larger
                upcount++;

            }
            prev_sum = next_sum;
        }
        System.out.println(" 5 Up_Count is " + upcount);

    }

}
