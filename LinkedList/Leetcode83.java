
// Remove Duplicates from sorted List

public class Leetcode83 {

    private Node head;
    private Node tail;

    private int size;

    public Leetcode83() {
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
    
    public void duplicates() {
        Node node = head;

        while(node.next != null) {
            if(node.value == node.next.value) {
                node.next = node.next.next;
                size--; 
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
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
        Leetcode83 list = new Leetcode83();
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(4);

        list.display();
        list.duplicates();
        list.display();
    }
}
