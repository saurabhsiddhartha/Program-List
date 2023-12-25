public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void add(int data, int idx) {
        if(idx ==0) {
            addFirst(data);
            return;
        }
       Node newnode = new Node(data);
       size++;
       Node temp = head;
       int i = 1; 
       while (i < idx) {
           temp = temp.next;
           i++;
       }
       newnode.next = temp.next;
       temp.next = newnode;
   }
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(4);
        list.addFirst(4);
        list.addLast(5);
        list.addLast(34);
        list.add(8,3);    
        // list.add(18,3);

        System.out.println();
        list.printList(head);
        System.out.println( " The size of the linked list "+size );
    }
}
