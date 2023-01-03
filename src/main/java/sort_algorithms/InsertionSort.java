package sort_algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Sit back, relax, enjoy the show!");

        /*
        Insertion Sort = after comparing elements to the left
                shift elements to the right to make room to insert a value;
                - Quadratic time O(n^2)
                small data =  decent
                big data - BAD
                -- Less steps than Bubble sort.
                -- Best case compared with Selection Sort
                         */

        int[] insertionArray = {9, 1, 8, 2, 7, 3, 6, 4, 10, 5};

        insertionSortMethod(insertionArray);

        for (int i : insertionArray) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSortMethod(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;  // keep track to compare from left whatever "i"  is
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];  // shift elements to right
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
