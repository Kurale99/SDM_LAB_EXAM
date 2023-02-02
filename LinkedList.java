
class Node {
    Node next;
    Node head;
    int data;

    Node() {

    }

    Node(int data) {
        this.data = data;
        head = next = null;
    }

    public void insert(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.next = null;
    }

    public void insertAtEnd(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.next = null;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node n1 = new Node();
        n1.insert(10);
        n1.insert(20);
        n1.insert(30);
        n1.insert(40);
        n1.insert(50);

    }

}