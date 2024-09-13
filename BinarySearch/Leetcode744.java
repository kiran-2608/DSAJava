//leetCode Question:744
//Find Smallest letter Greater Than target

public class Leetcode744 {
    public static void main(String[] args) {

        char[] arr={'c', 'f', 'j'};
        char ans = ceiling(arr,'a');
        System.out.println(ans);
    }

    static char ceiling(char[] letters,char target){

        
        int start = 0;
        int end = letters.length -1;
    
        while(start<=end){
            //find the middle element
            // int mid = (start + end)/2; //might be possible that (start + end) exceeds the range of integer in java

            int mid = start + (end-start) / 2;
        
            if(target<letters[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
            

        }
        return letters[start % letters.length];
    }
}
