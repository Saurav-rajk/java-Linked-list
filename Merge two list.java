import java.util.*;
import java.util.Collection;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Main{
    public static Node newNode(int data){
        return new Node(data);
    }
    public static void main(String[] args){
        Node a=new Node(3);
        a.next=new Node(4);
        a.next.next =new Node(7);
        a.next.next.next=new Node(14);

        Node b=new Node(2);
        b.next=new Node(19);
        b.next.next=new Node(13);

        List<Integer> v=new ArrayList<>();
        while(a !=null){
            v.add(a.data);
            a=a.next;
        }
        while(b!=null){
            v.add(b.data);
            b=b.next;
        }
        Collections.sort(v);
        Node result=new Node(-1);
        Node temp=result;
        for(int i=0;i<v.size();i++){
            result.next=new Node(v.get(i));
            result=result.next;

        }
        temp=temp.next;
        while(temp !=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }



    }
}