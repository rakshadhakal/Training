//Write a java program to input marks of 5 subjects.Calculate and display total obtained marks.

import java.util.Scanner;

public class SubjectMarks {
    public static void main(String[] args) {
        // input and store marks of 5 subjects
        double marks[] = new double[5];
        Scanner sc = new Scanner(System.in);
        // we use scannner object to take console input form user
        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Marks[" + i + "] =");
            marks[i] = sc.nextDouble();
        }
        // calculate total marks
        double sum = 0.0;
        for (double m : marks) { // for each mark m in marks array do this
            sum = sum + m;
        }
            System.out.println("Total Marks is: " + sum);
        }

    }
