package search_algorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Sit back, relax, enjoy the show!");
        /*
        binary search = Search algorithm that finds te position
                    of a target value within a sorted array.
                    Half of array is eliminated during each 'step'
         */

        int array[] = new int[1000000];
        int target = 499999;

        for (int i = 0; i < array.length; i += 1) {
            array[i] = i;
        }

        int valX = binarSrc(array, target);
        if (valX != -1) {
            System.out.println(target + " is found!");
        } else {
            System.out.println(valX + " is not found!");
        }

    }

    private static int binarSrc(int[] array, int targetx) {
        int start = 0;
        int finish = array.length - 1;
        while (start <= finish) {
            int middle = start + (finish - start) / 2;
            int value = array[middle];
            System.out.println("middle :" + value);
            if (value < targetx) start = middle + 1;
            else if (value > targetx) finish = middle - 1;
            else return middle; // target found

        }

        return -1;// target not found
    }
}
