package oop.interfete;


public class MainI {
    public static void main(String[] args) {
        System.out.println("Sit back. Relax. Enjoy the show!");
        System.out.println("Hello Bro");


        int result = 0;
        for (int i = 0; i < 6; i++) {
            if (i == 4) {
                result += 4;
            } else {
                result += i + 1;
            }
        }
        System.out.println(result);


    }
}