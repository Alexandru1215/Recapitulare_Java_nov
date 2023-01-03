package search_algorithm;

import jdk.jshell.EvalException;

public class LinearSerch {
    public static void main(String[] args) {
        System.out.println("Sit back, relax, enjoy the show!");

        /* linear search =  Iterate through a collection one element at a time
                            tun time complexity : O(n);

                            Disavantage:
                            * slow for large data set

                            Advantages:
                            * Fast for search of small to medium data sets
                            * Does not need to sorted
                            * Useful for data structure that do not have random access(LinkedList)
        O(n) =  linear time
                * looping through elements in an array
                * searching through a LinkedList
                */
/* exercitiu - declar array de numere
             - metoda
             - metoda statica (for lop)
             - if pentru afisare index
 */

        int[] ar01 = {9, 1, 8, 2, 7, 3, 4, 6, 5};

        int index = linearSearch(ar01, 10);
        if (index != -1) {
            System.out.println("Element found at index  -> " + index);
        } else {
            System.out.println("Element not found.");
        }

    }

    static int linearSearch(int[] ar01, int value) {
        for (int i = 0; i < ar01.length; i++) {
            if (ar01[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
