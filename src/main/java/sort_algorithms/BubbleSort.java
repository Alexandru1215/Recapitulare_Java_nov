package sort_algorithms;

public class BubbleSort {
    public static void main(String[] args) {

        /*
                'compare pairs'
            bubble sort =  pairs of adjacent  elements are compared, and the elements
                        swapped if they are not in order.
                        Quadratic time O(n^2)
                        small data set = okay -ish
                        large data set = Bad .. don t do it :)
         */

        int[] logData = {1, 3, 2, 5, 6, 72, 6, 4, 9, 11, 15, 17, 22, 26, 27, 44, 23, 77, 88, 99, 55, 43, 24, 19, 32, 35, 66};
        sortLogData(logData);
        for (int i : logData) {
            //  System.out.print(i + " ");
        }

        // test1 = bubble sort
        int[] test1 = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        test1Sort(test1);
        for (int index : test1) {
            //System.out.print(index + " ");
        }



    }

    private static void test1Sort(int[] array) {
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

    private static void sortLogData(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
