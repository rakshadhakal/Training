public class IfDemo {
    /*
     * if(condition){
     * //true block
     * }
     * if the condition is true then the block of code is executed or block is
     * skipped
     */
    public static void main(String[] args) {
        if (true) {
            System.out.println("I am always true");
        }
        // if(false)
        // {
        // System.out.println("I am always false");
        // }
        int a = 10;
        if (a >= 0) {
            System.out.println("A is positive");
        }
        if (a % 2 == 0)
            System.out.println("The value is even number");
        // when there is a single statement in a if block then we do not need to place
        // the curly braces.Braces are used to make a block of statement
        // which is necessary when we want to place multiple statement as a single unit
        // of task

        if (a >= 0 && a % 2 == 0) {
            System.out.println("A is positive");
            System.out.println("A is even number");
        }
        // when we have two alternative set of taskd then we have to use if-else
        // statement which lets us choose one branc and skip the other
        if (a % 2 != 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is even");
        }
        // if-else chain: if -else -if -else
        // when we have more than two branches to select form we have to connect
        // multiple
        // if else statements to form a chain
        int temp = 32;
        if (temp > 40) {
            System.out.println("Very hot weather");
        } else if (temp > 15) { // 40-16
            System.out.println("Warm weather");
        } else if (temp > 5) { // 15-6
            System.out.println("Cold weather");
        } else { // below 6
            System.out.println("Very cold weather");
        }
        // nesting example
        int marks = 66; // marks inpercentage
        if (marks >= 0 && marks <= 100) {
            System.out.println("Valid marks");
            // only grade the marks f it is Valid
            // using nested if statement to grade a marks i.e if inside if....
            if (marks >= 90) {
                System.out.println("Grade A+");
            } else if (marks >= 80) { // 80-89
                System.out.println("Grade A");
            } else if (marks >= 60) { // 60-79
                System.out.println("Grade B");
            } else if (marks >= 45) { // 45-59
                System.out.println("Grade C");
            } else if (marks >= 30) { // 30-44
                System.out.println("Grade D");
            } else { // less than 30
                System.out.println("Grade E");
            }

        } else {
            System.out.println("Invalid Marks");
        }

    }

}
