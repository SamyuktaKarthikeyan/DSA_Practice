
// You are using Java
import java.util.*;

class DLL {
    public class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        Node(int data, Node prev) {
            this.data = data;
            this.prev = prev;
            this.next = null;
        }
    }

    Node head = null;

    DLL() {
        this.head = null;
    }

    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        temp.next = new Node(data, prev);
        return;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        DLL m = new DLL();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            m.insert(sc.nextInt());
        }
        m.print();

    }
}