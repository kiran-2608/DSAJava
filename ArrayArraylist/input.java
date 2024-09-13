// package ArrayArraylist;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[2]=55;
        arr[3]=23;
        arr[4]=69;

        // System.out.println(arr[3]);

        //input using for loops
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        //Displaying using for loop
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+ " ");
        // }

        //using for each loop
        // for(int num:arr){ //for every element in array print the element 
        //     System.out.print(num + " ");//here num represents element of the array
        // }

        // System.out.println(arr[5]); // index out of bound error

        //array of objects
        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[0]="hii";
        System.out.println(Arrays.toString(str));

    }
    
}
