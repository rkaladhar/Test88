package pack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = next;
        System.out.println("data--->"+data);
        System.out.println("next--->"+next);
    }

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
    
    
}

public class SinglyLinkedList {
    Node head;

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
        	head = newNode;
        	System.out.println("head==> "+ head);
        	System.out.println("newNode==> "+ newNode);
        }
        else {
            Node current = head;
            System.out.println("current ### "+ current);
     
            while (current.next != null)
                current = current.next;
            System.out.println("current.next----->   " + current.next); 
            
            System.out.println("current----> "+ current);
            current.next = newNode;
            System.out.println("current.next ::::: "+ current.next);
        }
    }

    
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
     
        list.printList(); // Output: 1 -> 2 -> 3 -> null
    }
}

