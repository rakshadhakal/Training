public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Multiplication table from 1 to 10");
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.printf("%d X %d = %d\t", j, i, i * j);
            }
            System.out.println();
        }
    }

}
