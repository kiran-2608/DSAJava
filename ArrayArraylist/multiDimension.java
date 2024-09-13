import java.util.*;

public class multiDimension {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
          1 2 3
          4 5 6
          7 8 9
         */
        
        //sytax
        // int[][] arr = new int[3][3]; //adding rows is mandatory, column can be left empty
        // int[][] arr={
        //     {1,2,3},
        //     {4,5,},
        //     {6,7,8,9}
        // };

        //another way
        // int[][] arr={
        //     {1,2,3}, // 0th index
        //     {4,5}, // 1st index
        //     {6,7,8,9} // 2nd index -> arr[2]={6,7,8,9}
        // };
        
        int[][] arr = new int[3][3];
        System.out.println(arr.length); //prints no of rows

        //input
        for(int row=0;row<arr.length;row++){
            //for each col in every row
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //output
        //  for(int row=0;row<arr.length;row++){
        //     //for each col in every row
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        //another way for output
        // for(int row=0;row<arr.length;row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }
        
        //another way
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }


        
       
    }

        
}
    

