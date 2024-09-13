// package LeetCode;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        // dice("", 4);

        System.out.println(diceReturn("", 4));

        System.out.println(count("" , 4));
    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.print(p + " , ");
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static void diceFace(String p, int target , int face) {
        if (target == 0) {
            System.out.print(p + " , ");
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i , face);
        }
    }

    static ArrayList<String> diceReturn(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceReturn(p + i, target - i));
        }
        return list;
    }

    static int count(String p, int target) {
        if (target == 0) {

            return 1;
        }

        int count = 0;

        for (int i = 1; i <= 6 && i <= target; i++) {
            count = count + count(p + i, target - i);
        }

        return count;
    }
}
