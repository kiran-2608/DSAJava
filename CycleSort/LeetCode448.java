// Google

// Find All Numbers Disappeared in an Array

import java.util.ArrayList;
import java.util.List;

public class LeetCode448 {
    public static void main(String[] args) {
         
        int [] arr = {4 , 3 , 2 , 7 , 8 , 2 , 3 , 1};

        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);

    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]) {
                swap(nums , i , correctIndex);
            }
            else {
                i++;
            }
        }
        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for(int index = 0 ; index < nums.length ; index++) {
            if(nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }
   
    static void swap(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
