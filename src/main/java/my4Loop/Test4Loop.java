package my4Loop;

import java.util.ArrayList;
import java.util.Arrays;

public class Test4Loop {
    public static void main(String[] args) {

        //for loop =  executes  a block of code a limited amount of times
//
//        for (int i = 10; i >= 0; i -= 3) {
//            System.out.println(i);
//            // i-=3;
//        }
//        System.out.println("Sit back, relax, enjoy the show!");
//
//        for (int i = 0; i <= 10; i += 2) {
//            System.out.println(i);
//        }
//        System.out.println("******");
//        int[] numbersOfArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        // even numbers
        // odd numbers


//        for (int i = 0; i < numbersOfArray.length; i++) {
//          //  if (i % 2 == 0) System.out.println(i);
//            if (i % 2 == 1) System.out.println(i);
//        }


        //while
        double start;
        double finish;
        double elaspsedTime;


        start = System.nanoTime();

        System.out.println( addFastUp(1000000000));

        finish = System.nanoTime();


        elaspsedTime = start - finish;

        System.out.println(" addFasterUp " + elaspsedTime + " ns");

        //--------------------------////
        start = System.nanoTime();

        System.out.println( addFastUp(1000000000));

        finish = System.nanoTime();


        elaspsedTime = start - finish;

        System.out.println(" addUp " + elaspsedTime + " ns");


    }

    // linear time
    static int addUp(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //constant time
    static int addFastUp(int n) {
        int sum = n * (n + 1) / 2;
        return sum;
    }
}
