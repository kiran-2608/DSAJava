// Amazon  ,   Microsoft

// Find the Duplicate Number

public class LeetCode287 {
    public static void main(String[] args) {
        
        int[] arr = {1 , 3 , 4 , 2 , 2};
        int ans = findDuplicate(arr);
        System.out.println(ans);

    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {

            if(nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]) {
                    swap(nums , i , correctIndex);
                }
                else {
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
