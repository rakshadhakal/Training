public class WhileDemo {
    public static void main(String[] args) {
        // infinite loop
        // while(true)
        // System.out.println("*");
        // }
        int a = 10;
        while (a > 0) { // user want to loop 10 times but writes a incorrect logic to do
            // so
            System.out.println(a--); // a++
        }

        // System.out.println("hi");
        // while is suitable for loops that do not know the number of times it should
        // repeat
        int tank_volume = 1000;
        int bucket_volume = 1; // every time the bucket size increases by 1
        // Q.how many steps does it take to fill the tank?
        int water_in_tank = 0;
        int count = 0;
        while (water_in_tank <= tank_volume) { // repeat until tank id full
            water_in_tank = water_in_tank + bucket_volume;
            bucket_volume++;
            count++;

        }
        System.out.println("The tank is filled up in" + count + "steps.");
    }
}
