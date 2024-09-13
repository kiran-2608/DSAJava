//Amazon,Google,TCS,Accenture,Appple,Infosys
//Peak Index in a Mountain Array

public class Leetcode852 {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,5,6,4,3,2};
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);
        
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                //so i am in decreasing part of array
                //this may be the answer but look at left
                //this is why end != mid - 1
                end = mid;

            }
            else{
                //you are in ascending part of array
                start = mid + 1; //Because we know that mid+1 element > mid element
            }
        }
        //in the end, start == end and pointing to the largest number beacause of the 2 checks above
        //start and end are always trying to find max element in the above 2 checks
        //hence , when they are pointing to just one element, that is the maximum one because that is what the check say
        //more ellaboration:at every point of start and end, they have the best possible answer till that time
        //and if we are saying that only item is remaining,hence because of above line that is my bestpossible answer
        
        return start; // or return end as both are equal
    }
}
