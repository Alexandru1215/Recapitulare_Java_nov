package recap.pack;

import scala.Int;

import java.util.LinkedList;
import java.util.Stack;

public class MainTest {

    public static void main(String[] args) {
        // show the odd or even nr

        System.out.println("Showing even and odd nr using operators ");


        for (int i = 0; i < 2; i++) {
//            isOddOrEven(i);
//            isEvenOrOdd(i);
//            evenOrOdd(i);
        }

        Long x, y, z;
        x = 200000L;
        y = 300000L;
        z = x * y;
        System.out.println("result is " + z);

        Stack<Integer> stacky = new Stack<Integer>();
        stacky.push(1);
        stacky.push(2);
        stacky.push(4);
        stacky.push(3);
        System.out.println(stacky);
        stacky.pop();
        System.out.println(stacky);
        stacky.pop();
        System.out.println(stacky);
        try{
        for(int i=0 ; i <1000000000; i++) {
            stacky.push(i);
        }
        }catch (OutOfMemoryError e){
            System.err.println("OutOfMemoryError");
        }

    }


    //1st  with diff operator

    private static void isOddOrEven(int value) {
        int diff = value / 2;
        if (diff * 2 == value) {
            System.out.println("Using diff operator, " + value + " is even.");
        } else {
            System.out.println("Using diff operator, " + value + " is odd.");
        }
    }

    private static void isEvenOrOdd(int value) {
        if (((value & 1) == 0)) {
            System.out.println("Using logical operator '&' " + value + " is even.");
        } else {
            System.out.println("Using logical opertor '&' " + value + " is odd.");
        }
    }

    private static void evenOrOdd(int value) {
        if (value % 2 == 0) {
            System.out.println("Using modulo operator " + value + " is even.");
        } else {
            System.out.println("Using modulo operator " + value + " is odd.");
        }
    }

}

