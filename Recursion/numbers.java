// package Recursion;

public class numbers {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // Print first 5 numbers: 1 2 3 4 5

        print(1); 
         
    }

    static void print(int n) {
       if(n == 5) {
        System.out.println(5);
        return;
       }

       System.out.println(n);
       //recursive call
       // if you are calling a function again  , you cam treat it as a seprate call in the stack

       // this is called tail recursion
       // this is the last function call
       print(n + 1);
    }
    // static void print2(int n) {
    //     System.out.println(n);
    //     print3(3);
    // }
    // static void print3(int n) {
    //     System.out.println(n);
    //     print4(4);
    // }
    // static void print4(int n) {
    //     System.out.println(n);
    //     print5(5);
    // }
    // func body chages here
    // static void print5(int n) {
    //     System.out.println(n);
    // }
    
}
