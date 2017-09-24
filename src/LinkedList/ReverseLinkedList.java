package LinkedList;

public class ReverseLinkedList {

    // Head of linked list
    static Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    // Inserting into Head into Linked List
    void Insert(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }

    // Reversing a LinkedList (Iterative Approach)
    void ReverseIterative(){

        Node prev=null;
        Node current=head;
        Node n=null;

        while(current!=null){
            n=current.next;
            current.next=prev;
            prev=current;
            current=n;
        }
        head=prev;
    }


    //Reverse of a LinkedList ( Recursive Approach )

    Node RecursiveReverse(Node curr,Node prev){


        // Base Case
        if (curr.next==null){
            curr.next=prev;
            head=curr;
            return null;
        }

        //Recursive Case
        Node next=curr.next;
        curr.next=prev;
        RecursiveReverse(next,curr);
        //BackTracking
        return head;
    }


    // Printing List
    void PrintList(){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }

        System.out.println("");

    }

    public static void main(String[] args){

        ReverseLinkedList reverseLinkedList=new ReverseLinkedList();

        reverseLinkedList.Insert(10);
        reverseLinkedList.Insert(20);
        reverseLinkedList.Insert(30);
        reverseLinkedList.Insert(40);
        reverseLinkedList.Insert(50);
        reverseLinkedList.Insert(60);

        System.out.println("Before Reverse");

        reverseLinkedList.PrintList();

        reverseLinkedList.RecursiveReverse(head,null);

        System.out.println("After Reverse");

        reverseLinkedList.PrintList();

    }
}
