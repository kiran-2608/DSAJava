import java.util.*;
public class Questions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // boolean ans=isprime(n);
        // System.out.println(ans);
        
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");   
            }
        }
    }

    //print the 3 digits armstrong numbers
    /*example: a=153
              =1*1*1 + 5*5*5 + 3*3*3
              =1 + 125 + 27
              =153*/

    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        return sum==original; //return true is condition satisfies else return false 
    }          

    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c <= n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        if(c*c >n){
            return true;
        }
        else{
            return false;
        }

    }
    
}
