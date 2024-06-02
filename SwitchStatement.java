import java.util.Scanner;

public class SwitchStatement {
    // switch sttatement to create a menu based program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        // menu
        System.out.println("-----------------Welcome to Electricity billing app------------------------");
        System.out.println("1. View monthly bill");
        System.out.println("2. View pending bill");
        System.out.println("3. Pay bill amount");
        System.out.println("4. Report an issue");
        System.out.println("5. Exit");
        System.out.println("Enter your Choice(1-5):");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your monthly bill is 1200");
                break; // terminated the branch
            case 2:
                System.out.println("Your pending bill is 4500");
                break;
            case 3:
                System.out.println("Bill amount paid");
                break;
            case 4:
                System.out.println("Your issue has been registered");
                break;
            case 5:
                System.out.println("Existing system");
                break;

            default:
                System.out.println("Wrong Option selected");
                break;
        }
        System.out.println("Thank you \n Visit us again");

    }

}
