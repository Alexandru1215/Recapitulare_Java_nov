package sort_algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Sit back, relax, enjoy the show!");

        /*
        Selection sort = search through an array and keep track of the minimum value
                during each iteration. At the end of each iteration, we swap variables.

                small data = ok.
                big data = BAD
         */

        int[] arraySel = {9, 2, 8, 1, 7, 3, 6, 4, 5};
        selectSort(arraySel);
        for (int i : arraySel) {
            // System.out.print(i + " ");
        }
        //selection sort
        int[] test2 = {1, 3, 2, 5, 6, 72, 6, 4, 9, 11, 15, 17, 22, 26, 27, 44, 23, 77, 88, 99, 55, 43, 24, 19, 32, 35, 66};
        test2SelectSearch(test2);
        for (int index0 : test2) {
            System.out.print(index0 + " ");
        }

    }

    private static void test2SelectSearch(int[] arrayParam) {
        for (int i = 0; i < arrayParam.length - 1; i++) {
            int min = i; // facem prima cutie unde sta nr minim
            for (int j = i + 1; j < arrayParam.length; j++) {
                if (arrayParam[min] > arrayParam[j]) {
                    min = j;
                }
            }
            int temp = arrayParam[i];   // aici fac a 2 a cutie unde este tinut temporar nr care se compara
            arrayParam[i] = arrayParam[min];
            arrayParam[min] = temp;
        }
    }


    private static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;  // 1st box
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];    // 2nd box
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
