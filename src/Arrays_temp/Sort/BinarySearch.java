package Arrays_temp.Sort;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
       int[] arr ={1,5,3,4,5,2,5};
        //Arrays.binarySearch(arr,5);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(runBinarySearchIteratively(arr,5,0,6));
    }
    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}

