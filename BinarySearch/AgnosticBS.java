

public class AgnosticBS {
    public static void main(String[] args) {
        // int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int[] arr = {90,67,34,12,10,4,3,1};
        int ans = AgnosticBinarySearch(arr, 12);
        System.out.println(ans);
    }

    static int AgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

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
