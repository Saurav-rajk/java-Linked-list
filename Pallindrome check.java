//// Check the linked list is pallindrome or not.
import java.util.*;
class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(int data) {// It will add the data.
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public Node reverseSt(Node head) { // This function reverse the half
        Node prev = null;
        Node curr = head;

        if (head == null || head.next == null) {

            return prev;
        }

        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }
        return prev;

    }

    public Node findMiddle(Node head) { // find the middle.
        Node hare = head;
        Node turtle = head;
        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;


    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node middle = findMiddle(head);//first half ka end.
        Node secondHalfStart = reverseSt(middle.next);// start of secondhalf
        Node firstHalfStart = head;
        while (secondHalfStart != null) {
            if (firstHalfStart != secondHalfStart) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;


        }
        return true;
    }


    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(4);
        list.printList();
        boolean isPalindrome = list.isPalindrome(list.head);
        System.out.println(isPalindrome);


    }
}