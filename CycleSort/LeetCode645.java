// Amazon , Google , Microsoft

// Set Mismatch

import java.util.Arrays;

public class LeetCode645 {
    public static void main(String[] args) {
        
        int[] arr = {1 , 2 , 2 , 4};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
        
    }

    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr , i , correctIndex);
            }
            else {
                i++;
            }
        }

        // Search for Missig Number
        for(int index = 0 ; index < arr.length ; index++) {
            if(arr[index] != index + 1) {
                return new int[] {arr[index] , index + 1};
            }
        }


        // case 2
        return new int[]{-1 , -1};
    }

    static void swap(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
