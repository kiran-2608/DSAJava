// package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3 , 1 , 5 , 4 , 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            //find the max item in the remaining array and swap with correct index
            int lastIndex = arr.length - i -1;
            int maxIndex = getMaxINdex(arr , 0 , lastIndex);

            swap(arr, maxIndex , lastIndex);
        }
    }
    static int getMaxINdex(int[] arr , int start , int end) {
        int max = start;
        for(int i = start ; i <= end ; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }
    
    static void swap(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
