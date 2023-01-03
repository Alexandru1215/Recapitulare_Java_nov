package algorithms_recap;

import java.util.Arrays;

public class TestAlgo {
    public static void main(String[] args) throws Exception {
        System.out.println("Sit back, relax, enjoy the show!");

        // Collection of steps to solve a  problem
        // linear search
        // Why?
        // - write code that is both time and memory efficient
        // Common asked question involve DS & A in coding job interview


        // 1 linear search  - search  nr at index.
        // 2 binary search - big data , sorted array.
        // 3 interpolation search - big data , sort array.
        // 4 bubble Sort - okay ish small data , DON'T use for BIG

        int[] ar1 = {9, 1, 8, 2, 7, 3, 4, 6, 5};
        int target = 12;
        int valIndex = the1stSrch(ar1, target);
        if (valIndex != -1) {
            System.out.println(target + " is found , at index " + valIndex);
        } else {
            System.out.println("Element is not there.");
        }
        // find element 666 - binarSrc


        int[] arrayS = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int targetS = 256;
//        for (int i = 0; i < arrayS.length; i += 1) {
//            arrayS[i] = i;
//        }
        int indexOfArr = binarSrc(arrayS, targetS);
        if (indexOfArr != -1) {
            System.out.println(targetS + " found at index -> " + indexOfArr);
        } else {
            System.out.println("Element not found.");
        }

        int[] array2 = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int searchNumber = 32;

        int index1 = interpolSearch(array2, searchNumber);
        if (index1 != -1) {
            System.out.println(searchNumber + " found at index -> " + index1);
        } else {
            System.out.println("Element not found.");
        }

        // sort

        int[] sortNr = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        System.out.println("After sort method.");
        sortTheNumbers(sortNr);
        for (int i : sortNr) {
            System.out.print(i + " ");
        }

    }

    private static void sortTheNumbers(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static int interpolSearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe : " + probe);
            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }


        }

        return -1;
    }


    private static int binarSrc(int[] array, int param) {
        int count = 1;
        int start = 0;
        int finish = array.length - 1;
        while (start <= finish) {
            int midd = start + (finish - start) / 2;
            int value = array[midd];
            System.out.println("Go in " + value + " and this is  nr " + count++ + " step");
            if (value < param) start = midd + 1;
            else if (value > param) finish = midd - 1;
            else return midd; // target found

        }

        return -1; // target not found
    }


    private static int the1stSrch(int[] ar1, int value) {
        for (int i = 0; i < ar1.length; i += 1) {
            if (ar1[i] == value) {
                return i;
            }
        }
        return -1;
    }


}
