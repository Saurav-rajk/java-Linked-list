import java.util.*;
class Node{
    public int data;
    public Node next;
}
class NodeOperation{
    public void pushNode(Node[] headRef,int dataVal){
        Node newNode = new Node();
        newNode.data = dataVal;
        newNode.next = headRef[0];  // Link the old list to new node.
        headRef[0] = newNode;    // move the head to point to new node
    }
}
public class Main{
    public static void main(String[] args){
        Node[] head=new Node[1];
        NodeOperation temp=new NodeOperation();
        for(int i=9;i>0;i--){
            temp.pushNode(head,i);

        }
        ArrayList<Integer> v =new ArrayList<Integer>();
        Node curr = head[0];
        while(curr != null){

            v.add(curr.data);
            curr=curr.next;
        }
        System.out.println("Middle Value of Linked List is: ");
        System.out.println(v.get(v.size()/2));
    }
}