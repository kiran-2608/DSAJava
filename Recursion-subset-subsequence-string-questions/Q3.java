// package Recursion-subset-subsequence-string-questions;


// Skip a string if its nit the required string

public class Q3 {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bcdappcdah"));
    }

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }

    }
}
