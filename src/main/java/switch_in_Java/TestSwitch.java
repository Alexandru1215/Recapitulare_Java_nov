package switch_in_Java;

public class TestSwitch {
    public static void main(String[] args) {
        // switch = statement that allows a variable to be tested for equality against a list of values
        // test a String -  day of the week;


        String day = "free time";             // ce vreau sa testez pentru testare.
                                             // daca nu este in lista se duce in default -
        switch (day) {   // ce anume testez
            case "Sunday":
                System.out.println("It is Sunday!");
                break; // iesim si continuam cu restul codului.
            case "Monday":
                System.out.println("It is Monday!");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday!");
                break;
            case "Thursday":
                System.out.println("It is Thursday!");
                break;
            case "Friday":
                System.out.println("It is Friday!");
                break;
            case "Saturday":
                System.out.println("It is Saturday!");
                break;
            default:
                System.out.println("It is weekend - grab some pizza!");
        }


    }
}
