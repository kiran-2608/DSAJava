import java.util.Scanner;
public class methods{
    public static void main(String[] args) {
        //Q:take input of 2 numbers and print the sum
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The Sum is: "+ sum);
    }
}