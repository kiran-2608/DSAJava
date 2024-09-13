
public class SearchInrange {
    public static void main(String[] args) {
        
        //Q: arr=[18,12,-7,3,14,28]
        //Search for 3 in the range of index[1,4]

        int[] arr= {18,12,-7,3,14,28};
        int start=1;
        int end=4;
        int target=3;
        System.out.println(range(arr, start, end, target));

    }
    static boolean range(int[] arr,int start,int end,int target){
        for(int index=start; index<end; index++){
            int element=arr[index];
            if(element==target){
                return true;
            }

        }
        return false;
    }
}
