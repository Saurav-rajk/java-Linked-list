 //Given the head of a linked list remove the nth node from the end of the list and return its head.
class Sol{
    ListNode head;
    class ListNode{
        int data;
        int n;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.n=n;
            this.next=null;
        }

    }
    public void addFirst(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public ListNode removenthEnd(ListNode head,int n){
        if(head.next==null){
            return null;
        }
        int size=0;
        ListNode curr =head;
        while(curr != null){
            curr=curr.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        int indexToSearch=size-n;
        ListNode prev=head;
        int i=1;
        while(i<indexToSearch){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        ListNode curr=head;
        while(curr !=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        int n=3;
        Sol list=new Sol();
        list.addFirst(2);
        list.addFirst(4);
        list.addFirst(6);
        list.addFirst(9);
        list.addFirst(3);
        list.printList();
        list.head=list.removenthEnd(list.head, 3);
        list.printList();

    }
}
