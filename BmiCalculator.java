import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        double bmi, height, weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BMI Calculator");
        System.out.println("Enter your Height(meters)");
        height = sc.nextDouble();
        System.out.println("Enter your weight(kg):");
        weight = sc.nextDouble();
        bmi = weight / (height * height); // or bmi=weight/Math.pow(height,2);
        if (bmi > 25) { // above 25
            System.out.println("You are overweight");
        } else if (bmi >= 15) { // 15-25
            System.out.println("You are normal weight");
        } else {
            System.out.println("you are under-weight");
        }
        System.out.println("Thank you!");
        sc.close();
    }

}
