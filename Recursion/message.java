// package Recursion;

public class message {
    public static void main(String[] args) {
        //write a function that prints hello
        message();
    }

    static void message() {
        System.out.println("Hello");
        message2();
    }

    static void message2() {
        System.out.println("Hello2");
        message3();
    }

    static void message3() {
        System.out.println("Hello3");
    }
}
