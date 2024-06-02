import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        int x,y,sum;
        Scanner in= new Scanner(System.in);
        System.out.println("Input first Number");
        x=in.nextInt();
        System.out.println("Input Second Number");
        y=in.nextInt();
        sum=x+y;
        System.out.println("SUM=" +sum);
    }
}
