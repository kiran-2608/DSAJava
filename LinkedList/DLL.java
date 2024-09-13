public class DLL {


    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        
        if(head != null) {
            head.prev = node;
        }

        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if(head == null) {
            node.prev = null;
            head = node;
        }

        while (last.next!= null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }

    public void insertAfter(int after , int val) {
        Node p = find(after);
       
        if(p == null) {
            System.out.println("does not exits");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!= null) {
            node.next.prev = node;
        }
    }

    public Node find(int value) {
        Node node = head;
        while(node!= null) {
            if(node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while(temp != null) {
            System.out.print(temp.val + " <-> ");
            last = temp; 
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while(last != null) {
            System.out.print(last.val + " <-> ");
            last = last.prev;
        }
        System.out.println("START");
    }

     

    
   

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);

        list.insertLast(99);

        list.insertAfter(99, 4);

        list.display(); // 3 <-> 2 <-> 1 <-> null
        

    }
}
