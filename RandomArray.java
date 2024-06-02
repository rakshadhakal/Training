public class RandomArray {
    // this program collects 10 random values and find max and min random value
    public static void main(String[] args) {
        // datatype [] aaray_name= new datatype[size];
        int[] data = new int[10];
        // this array stores 10 integer elements
        // Generate random values between 0 and 100 and assign them to array
        for (int i = 0; i < data.length; i++) {
            int r = (int) (Math.random() * 100); // 0.000 -----------1.000000
            data[i] = r;
        }

        // find min and max
        int min = data[0];
        int max = data[0];
        for (int e : data) {
            if (min > e) {
                min = e;
            }
            if (max < e) {
                max = e;
            }
        }
        System.out.println("The minimum value is:" + min);
        System.out.println("The maximum value is:" + max);
    }

}
