//  Find First and Last Position of Element in Sorted numsay

public class Leetcode34 {
    public static void main(String[] args) {
        
        int[] nums={5,7,7,8,8,10};
        int[] ans=searchRange(nums, 7);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        //check for the first occurance if target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;

    }

    //this function just returns the index value of target
    static int search(int[] nums, int target,boolean findstartIndex){

        int ans = -1;
        int start = 0;
        int end = nums.length -1;
    
        while(start<=end){
            //find the middle element
            // int mid = (start + end)/2; //might be possible that (start + end) exceeds the range of integer in java

            int mid = start + (end-start) / 2;
        
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                //potential answer found
                ans=mid;
                if(findstartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return ans;
    }
}
