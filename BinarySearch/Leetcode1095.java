//Google, Amazon 
//1095. Find in Mountain Array

public class Leetcode1095 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,3,1};
        int target=3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = AgnosticBinarySearch(arr, target, 0 , peak);
        if(firstTry != -1){
            return firstTry;
        }
        //try to search in second half
        return AgnosticBinarySearch(arr, target, peak+1, arr.length - 1);
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

    static int AgnosticBinarySearch(int[] arr, int target, int start, int end){
        

        //find whether the array is sorted in ascending or descending
        // boolean isAsc;
        // if(arr[start] < arr[end]){
        //     isAsc = true;
        // }
        // else{
        //     isAsc = false;
        // }

        //better way
        boolean isAsc = arr[start] < arr[end];
    
        while(start<=end){
            //find the middle element
            // int mid = (start + end)/2; //might be possible that (start + end) exceeds the range of integer in java

            int mid = start + (end-start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                //ascending
                 if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                //descending
                 if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return -1;
    }

}
