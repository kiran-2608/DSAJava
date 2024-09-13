//LeetCode Question 1295

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        // System.out.println(digits(12345)); // to find number of digits 
        System.out.println(digits2(12345)); // to find number of digits 
        
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }

    //function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;

        //shortcut method
        // return numberOfDigits % 2 == 0;
    }

    //counts number of digits in a number
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;

    }

    //Second way to find number of digits
    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
