package search_algorithm;

public class InterpolationSearch {
    public static void main(String[] args) {
        System.out.println("Sit back, relax, enjoy the show!");
        /*
        Interpolation search =  improvement over binary search best used for 'uniformly' distributed
                    'guess' where a value might be  based on calculated probe results.
                    If probe is incorrect, search area is narrowed, and a new probe is calculated.

                    average case - O(log(log(n)))
                    worst case - O(n) -  value increase exponentially
         */


        int[] interArr = {1, 2, 4, 6, 8, 16, 32, 64, 128, 256, 512, 1024};
        int targetX = 128;

        int index1 = searchInterPol(interArr, targetX);
        if (index1 != -1) {
            System.out.println(targetX + " found at index " + index1);
        } else {
            System.out.println("Element not found.");
        }
    }

    private static int searchInterPol(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) *
                    (value - array[low]) /
                    (array[high] - array[low]);
            System.out.println("probe : " + probe);
            if (array[probe] == value) {
                return probe;   // found
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }

        }


        return -1; // not found
    }
}
