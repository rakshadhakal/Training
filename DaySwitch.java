public class DaySwitch {
    public static void main(String[] args) {
        String day_name = "Sunday";
        int day_number = 1;
        // let us suppose 0 represents not assigned any particular day
        switch (day_name) {
            case "Sunday" -> {
                day_number = 1;
                System.out.println("Hi");
            }
            case "Monday" ->
                day_number = 2;
            case "Tuesday" ->
                day_number = 3;
            case "Wednesday" ->
                day_number = 4;
            case "Thursday" ->
                day_number = 5;
            case "Friday" ->
                day_number = 6;
            case "Saturday" ->
                day_number = 7;

            default ->
                System.out.println("Wrong day entry");
        }
        if (day_number == 0) {
            System.out.println("Day number not assigned");
        } else {
            System.out.println("Day number is" + day_number);
        }
    }

}
