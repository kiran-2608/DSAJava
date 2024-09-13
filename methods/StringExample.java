import java.util.*;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String msg=greet();
        // System.out.println(msg);

        System.out.println("Enter your name");
        String naam=sc.next();
        String msg=myGreet(naam);
        System.out.println(msg);
    }
    static String greet(){
        return "Bye";
    }

    static String myGreet(String name){
        String message="Hello " + name;
        return message;
    }
}
