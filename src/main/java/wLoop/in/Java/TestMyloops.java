package wLoop.in.Java;

import java.util.Scanner;

public class TestMyloops {
    public static void main(String[] args) {

        // while loop =  executes a  block of code as long as a it's condition true

        //ex 2

        Scanner sc = new Scanner(System.in);
        String user = " user";
        String pass = " pass ";

        int i = 0;
        while (i <= 2) {
            System.out.println("Enter your  user - ");
            user = sc.nextLine();
            System.out.println("Enter your  password - ");
            pass = sc.nextLine();
            if (user.equals("user") && pass.equals("pass")) {
                System.out.println("Welcome in account ! ");
                break;
            } else if (!user.equals("user") && pass.equals("pass") || i <= 2) {
                System.out.println("User or password is wrong !");
                i++;
            }
        }


            // ex 2
                String name = "";

            while (name.isEmpty()){
                System.out.println("Enter your name ");
                name= sc.nextLine();
            }
        System.out.println("Welcome in "+name);
    }
}
