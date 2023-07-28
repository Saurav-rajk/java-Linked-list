class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Main{
    public static void remDuplicate(Node head){
        if(head==null){
            return;
        }
        Node current = head;
        while(current.next !=null){
            if(current.data==current.next.data){
                current.next=current.next.next;//Skip the duplicte node
            }else{
                current = current.next;// Move to the next non-duplicate node
            }
        }
    }
    public static void printLinkedList(Node head){
        Node current=head;
        while(current !=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(3);
        head.next.next.next.next.next=new Node(4);
        System.out.println("Original Linked list: ");
        printLinkedList(head);
        remDuplicate(head);
        System.out.println("Linked List after removing duplicates: ");
        printLinkedList(head);

    }
}