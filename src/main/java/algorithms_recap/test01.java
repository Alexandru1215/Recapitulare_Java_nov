package algorithms_recap;

public class test01 {
    public static void main(String[] boom) {
        // search algorithm ... use an unsorted array of Integers. to demonstrate how it works


        int[] testArray01 = {9, 1, 8, 2, 7, 1024, 3, 6, 4, 5, 10, 16, 128, 32, 256, 64, 512,};
        int[] testArray02 = {1, 2, 4, 6, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096};
        // 1. linear search,
        System.out.println("Linear search is easy. ");
        System.out.println("Will run anyway!");
        int target = 128;
        int index01 = searchNrWithLinear(testArray01, target);
        if (index01 != -1) {
            System.out.println(target + " found at index: " + index01 + ".");
        } else {
            System.out.println("Element not found!");
        }
        System.out.println(" ");
        System.out.println("Binary Search is easy.");
        System.out.println("Will run anyway.");

        // 2. Binary Search ,
        // need sorted array - big data.
        int target02 = 128;
        int index02 = searchNrWithBinary(testArray02, target02);
        if (index02 != -1) {
            System.out.println(target02 + " found at index: " + index02 + ".");
        } else {
            System.out.println("Element not found!");
        }
        System.out.println(" ");
        System.out.println("Interpolation search is easy and -> \"Will work any way\"");

        // 3. Interpolation Search
        //some improves after binary, faster and better fof big data, need sorted array
        int target03 = 128;
        int index03 = searchNrWithInterpol(testArray02, target03);
        if (index03 != -1) {
            System.out.println(target03 + " found at index: " + index03 + ".");
        } else {
            System.out.println("Element not found!");
        }
        System.out.println(" ");
    }


    private static int searchNrWithInterpol(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) *
                    (value - array[low]) /
                    (array[high] - array[low]);
            System.out.println("probe : " + probe);
            if (array[probe] == value) {
                return probe; // found
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }

    private static int searchNrWithBinary(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int midd = low + (high - low) / 2;
            int value = array[midd];
            System.out.println("middle step in : " + value);
            if (value < target) low = midd + 1;
            else if (value > target) high = midd - 1;
            else return midd;
        }
        return -1;
    }

    private static int searchNrWithLinear(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
