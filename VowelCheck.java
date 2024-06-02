import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        c = sc.next().charAt(0);
        // extracts first character form input word as string
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The Character is vowel");
                break;

            default:
                System.out.println("The character is not a vowel");00












                
        }
    }

}
