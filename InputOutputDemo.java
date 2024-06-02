//demonstrate the scanner class to work with console input output

import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter byte value:"); // prompt user for input
        byte b = input.nextByte(); // input in a base 10 number format in byte range

        System.out.println("Enter short value in binary"); // input in binary with upto 15 digits
        short s = input.nextShort(2); // input number in base 2 format i.e binary

        System.out.println("Enter integer value");
        int i = input.nextInt();

        System.out.println("Enter long value:");
        long l = input.nextLong();

        System.out.print("Byte value is:" + b);
        System.out.println("Short value is:" + s + "\n"); // \n is a escape sequence for new line1
        System.out.println("integer value is " + i); // prints a new line after the value
        System.out.printf("Long value is %d \n", l);

        System.out.println("Enter float value: ");
        float f = input.nextFloat();
        System.out.println("Enter double value: ");
        double d = input.nextDouble();
        System.out.printf("Float is %.2f \n double is %.2g \n", f, d);

        // to input character we first have to input a word and extract a chracter from
        // the word
        System.out.println("Enter a character:");
        char c = input.next().charAt(0); // 0 index is used to extract first character from input

        System.out.println("Enter two boolean values:"); // true false
        boolean b1 = input.nextBoolean();
        boolean b2 = input.nextBoolean();
        System.out.println("First boolean is " + b1);
        System.out.println("Second boolean is " + b2);

        System.out.println("Enter your name: ");
        input.nextLine(); // dummy to consume blank input after using other input statement
        String name = input.nextLine();
        System.out.println("your name is: " + name);
        input.close();
    }

}
