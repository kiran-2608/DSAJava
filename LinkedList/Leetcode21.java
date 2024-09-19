
// Merge two Sorted List

public class Leetcode21 {


   

    private Node head;
    private Node tail;

    private int size;

    public Leetcode21() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }
    
    public static Leetcode21 merge(Leetcode21 first , Leetcode21 second) {
        Node f = first.head;
        Node s = second.head;

        Leetcode21 ans = new Leetcode21();

        while(f != null && s != null) {
            if(f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;

    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }


    public void display() {
        Node temp =  head;
        
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        
    }
    public static void main(String[] args) {
        Leetcode21 first = new Leetcode21();
        Leetcode21 second = new Leetcode21();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(4);


        Leetcode21 ans = Leetcode21.merge(first, second);

        ans.display();

    }
}
