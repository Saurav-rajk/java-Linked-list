// Create a reverse linked list with constatnt space complexity.

//class LL{
//    Node head;
//    class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public void addFirst(int data){
//        Node newNode=new Node(data);
//        if(head==null){
//            head=newNode;
//            return;
//        }
//        newNode.next=head;
//        head=newNode;
//    }
//    public void printList(){
//        if(head==null){
//            System.out.println("List is empty");
//            return;
//        }
//        Node currNode=head;
//        while(currNode != null){
//            System.out.print(currNode.data+"->");
//            currNode=currNode.next;
//        }
//        System.out.println("NULL");
//    }
//    public void reverseIterate(){
//        if(head==null||head.next==null){
//            return;
//        }
//        Node prevNode=head;
//        Node currNode=head.next;
//        while(currNode != null){
//            Node nextNode=currNode.next;
//            currNode.next=prevNode;
//            // update
//            prevNode=currNode;
//            currNode=nextNode;
//        }
//        head.next=null;
//        head=prevNode;
//    }
//    public static void main(String[] args){
//        LL list=new LL();
//        list.addFirst(5);
//        list.addFirst(4);
//        list.addFirst(3);
//        list.addFirst(2);
//        list.addFirst(1);
//        list.printList();
//        list.reverseIterate();
//        list.printList();
//    }
//
//}

// Reversing with the help of recursion.
//class LL{
//    Node head;
//    class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public void addFirst(int data){
//        Node newNode=new Node(data);
//        if(head==null){
//            head=newNode;
//            return;
//        }
//        newNode.next=head;
//        head=newNode;
//    }
//    public void printList(){
//        if(head==null){
//            System.out.println("List is empty");
//            return;
//        }
//        Node currNode=head;
//        while(currNode != null){
//            System.out.print(currNode.data+"->");
//            currNode=currNode.next;
//        }
//        System.out.println("NULL");
//    }
//    public Node reverseRecursive(Node head){
//        if(head==null || head.next==null){
//            return head;
//        }
//        Node newhead=reverseRecursive(head.next);
//        head.next.next=head;
//        head.next=null;
//        return newhead;
//
//    }
//
//    public static void main(String[] args){
//        LL list=new LL();
//        list.addFirst(5);
//        list.addFirst(4);
//        list.addFirst(3);
//        list.addFirst(2);
//        list.addFirst(1);
//        list.printList();
//        list.head=list.reverseRecursive(list.head);
//
//        list.printList();
//    }
//
//}

// Given the head of a linked list remove the nth node from the end of the list and return its head.
//class Sol{
//    ListNode head;
//    class ListNode{
//        int data;
//        int n;
//        ListNode next;
//        ListNode(int data){
//            this.data=data;
//            this.n=n;
//            this.next=null;
//        }
//
//    }
//    public void addFirst(int data){
//        ListNode newNode=new ListNode(data);
//        if(head==null){
//            head=newNode;
//            return;
//        }
//        newNode.next=head;
//        head=newNode;
//
//    }
//    public ListNode removenthEnd(ListNode head,int n){
//        if(head.next==null){
//            return null;
//        }
//        int size=0;
//        ListNode curr =head;
//        while(curr != null){
//            curr=curr.next;
//            size++;
//        }
//        if(n==size){
//            return head.next;
//        }
//        int indexToSearch=size-n;
//        ListNode prev=head;
//        int i=1;
//        while(i<indexToSearch){
//            prev=prev.next;
//            i++;
//        }
//        prev.next=prev.next.next;
//        return head;
//    }
//    public void printList(){
//        if(head==null){
//            System.out.println("List is empty");
//            return;
//        }
//        ListNode curr=head;
//        while(curr !=null){
//            System.out.print(curr.data+"->");
//            curr=curr.next;
//        }
//        System.out.println("NULL");
//    }
//    public static void main(String[] args){
//        int n=3;
//        Sol list=new Sol();
//        list.addFirst(2);
//        list.addFirst(4);
//        list.addFirst(6);
//        list.addFirst(9);
//        list.addFirst(3);
//        list.printList();
//        list.head=list.removenthEnd(list.head, 3);
//        list.printList();
//
//    }
//}

//// Check the linked list is pallindrome or not.
//import java.util.*;
//class LL{
//    Node head;
//    class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//
//    }
//    public void addFirst(int data){// It will add the data.
//        Node newNode=new Node(data);
//        if(head==null){
//            head=newNode;
//            return;
//        }
//        newNode.next=head;
//        head=newNode;
//    }
//    public void printList(){
//        if(head==null){
//            System.out.println("List is empty");
//        }
//        Node curr=head;
//        while(curr != null){
//            System.out.print(curr.data+" ");
//            curr=curr.next;
//        }
//        System.out.println("NULL");
//    }
//    public Node reverseSt(Node head){ // This function reverse the half
//        Node prev=null;
//        Node curr=head;
//
//        if(head==null || head.next==null){
//
//            return prev;
//        }
//
//        while(curr !=null){
//            Node nextNode=curr.next;
//            curr.next=prev;
//
//            prev=curr;
//            curr=nextNode;
//        }
//        return prev;
//
//    }
//    public Node findMiddle(Node head){ // find the middle.
//        Node hare=head;
//        Node turtle=head;
//        while(hare.next != null && hare.next.next !=null){
//            hare=hare.next.next;
//            turtle=turtle.next;
//        }
//        return turtle;
//
//
//    }
//    public boolean isPalindrome(Node head){
//        if(head==null || head.next ==null){
//            return true;
//        }
//        Node middle=findMiddle(head);//first half ka end.
//        Node secondHalfStart=reverseSt(middle.next);// start of secondhalf
//        Node firstHalfStart = head;
//        while(secondHalfStart != null){
//            if(firstHalfStart !=secondHalfStart){
//                return false;
//            }
//            firstHalfStart=firstHalfStart.next;
//            secondHalfStart=secondHalfStart.next;
//
//
//        }
//        return true;
//    }
//
//
//
//    public static void main(String[] args){
//        LL list=new LL();
//
//        list.addFirst(1);
//        list.addFirst(2);
//        list.addFirst(1);
//        list.addFirst(4);
//        list.printList();
//        boolean isPalindrome=list.isPalindrome(list.head);
//        System.out.println(isPalindrome);
//
//
//    }
}