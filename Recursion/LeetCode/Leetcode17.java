// package LeetCode;

// Google , Amazon , Microsoft

// Letter Combinations of a Phone Number

import java.util.ArrayList;

public class Leetcode17 {
    public static void main(String[] args) {
        // phone("", "12");

        System.out.println(letterCombinations("", "12"));

        System.out.println(phoneCount("", "12"));

    }

    static void phone(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " , ");
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            phone(p + ch, up.substring(1));

        }
    }

    static ArrayList<String> letterCombinations(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            list.addAll(letterCombinations(p + ch, up.substring(1)));

        }

        return list;
    }

    static int phoneCount(String p, String up) {
        if (up.isEmpty()) {

            return 1;
        }

        int count = 0;

        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            count = count + phoneCount(p + ch, up.substring(1));

        }
        return count;
    }

    
}
