
public class Remove_Duplicate {
	public static Node head;
	public static Node tail;
	public static int size;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addlast(int data) {
		Node newnode = new Node(data);
		size++;
		if (head == null) {
			head = tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void duplicate() {
		Node current = head;
		while (current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
				size--;
			} else {
				current = current.next;
			}
		}
		tail = current;
		tail.next = null;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "  ");
			temp = temp.next;
		}
		System.out.println(" End ");
	}

	public static void main(String[] args) {
		Remove_Duplicate list = new Remove_Duplicate();
		list.addlast(3);
		list.addlast(3);
		list.addlast(3);
		list.addlast(5);
		list.addlast(4);
		list.addlast(6);
		list.print();
		list.duplicate();
		list.print();
	}

}
