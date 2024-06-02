public class Factor {
    // generate a factor of a given number
    public static void main(String[] args) {
        int num = 500;
        System.out.println("Factor of " + num + "are ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.println(i + "");
        }
    }
}
