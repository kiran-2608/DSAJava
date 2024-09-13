import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // add();
        // int ans=add2();
        // System.out.println(ans);

        int ans=add3(10,20);
        System.out.println(ans);
        
    }

    //return the value
    static int add2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        return sum;

    }

    //Pass the value of numbers when you are calling the method in main()

    static int add3(int a,int b){
        int sum=a+b;
        return sum;
    }

    static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The Sum is: "+ sum);
    }
}
