import java.util.Scanner;

public class MenuApp {
    // demonstrate the use of do-while along with switch case to create a menu based
    // app
    static Scanner sc = new Scanner(System.in);

    public static int menu() {
        int choice;
        System.out.println("Welcome to menu app");
        System.out.println("1. Option A");
        System.out.println("2. Option B");
        System.out.println("3. Option C");
        System.out.println("4. Exit");
        System.out.println("Enter your option no. :");
        choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        boolean repeat = true;
        int option;
        do {
            option = menu();
            switch (option) {
                case 1:
                    System.out.println("User selects option A");
                    break;
                case 2:
                    System.out.println("User selects option B");
                    break;
                case 3:
                    System.out.println("User selects option C");
                    break;
                case 4:
                    System.out.println("Good bye");
                    repeat = false;
                    break;

                default:
                    System.out.println("Wrong choice selected");
                    System.out.println("Repeat again");

            }
        } while (repeat);
        sc.close();
    }

}
