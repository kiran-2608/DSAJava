public class Leetcode410 {
    public static void main(String[] args) {
        
    }

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int i = 0 ; i < nums.length ; i++){
            start = Math.max(start , nums[i]); // in the end of the loop this will contain the max item from the array
            end += nums[i]; // sum of the array
        }

        //binary search
        while(start < end){
            //try for the middle as potential ans
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum  + num > mid){
                    //you cannot add this in the subarray, make an new one
                    //say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }
                else{
                    sum+= num;
                }
            }
            if(pieces > m){
                start = mid + 1;
            }
            else{

            }

        }
        return end; // here start == end
    }
}
