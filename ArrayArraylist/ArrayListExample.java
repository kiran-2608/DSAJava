import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //syntax
        ArrayList<Integer>list = new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);
        // list.add(60);

        // System.out.println(list.contains(20));

        // list.set(0, 99);
        // list.remove(2);

        // System.out.println(list);

        //input
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        //output
        //get item at any index
        for(int i=0;i<5;i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
