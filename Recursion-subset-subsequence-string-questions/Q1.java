// package Recursion-subset-subsequence-string-questions;

// Skip a character

public class Q1 {
    public static void main(String[] args) {
        // skip("", "baccda");
        System.out.println(skip("aabbccddaa"));
        System.out.println(skipApple("aaapplebd"));
    }

    // p - processed , up - unProcessed
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }

    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }

    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }

    }

    ststic String skipppApple(String up) {
        if(*up.isEmpty() ){
            return "";
        }
        if(up.startsWith(up.substring(1))) {
            return skip(up)
        }
    }

}
