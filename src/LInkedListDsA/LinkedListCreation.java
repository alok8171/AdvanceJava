package LInkedListDsA;
import java.util.Scanner;

class Node
{
    int value;
    Node next;

    Node(int value)
    {
        this.value=value;
    }
}

public class LinkedListCreation {

    public void display(Node head)//display all linkedlist element
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node a=new Node(sc.nextInt());
        Node b=new Node(sc.nextInt());
        Node c=new Node(sc.nextInt());
        Node d=new Node(sc.nextInt());
     //   Node head=new Node(Node a);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
       // System.out.println(a.value);
        LinkedListCreation obj = new LinkedListCreation(); // object create
        obj.display(a); // head p


    }
}
