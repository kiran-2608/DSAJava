import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {24,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };

        //max value
        System.out.println(max(arr));


        int target=34;
        int[] ans = search(arr, target); //format of return value {row,col}
        System.out.println(Arrays.toString(ans));

        
    }

    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //finding the maximum value
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }


    
}
