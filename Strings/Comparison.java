// package Strings;

public class Comparison {
    public static void main(String[] args) {
        
        String a = "kiran";
        String b = "kiran";
        String c = a;
        System.out.println(c == a);

        // ==
        // System.out.println(a == b); //true

        String name = new String("kiran");
        String name2 = new String("kiran");

        // System.out.println(name == name2); //false

        System.out.println(name.equals(name2)); //true

        System.out.println(name.charAt(0));



    }
}
