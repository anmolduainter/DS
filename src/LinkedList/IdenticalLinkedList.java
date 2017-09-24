package LinkedList;


public class IdenticalLinkedList {


    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    Node getHead(){
        return head;
    }

    // Checking Method
    boolean checkingIdentical(Node head1 , Node head2){

        if (head1==null && head2==null){
            return true;
        }
        if (head1!=null && head2!=null){
             return (head1.data==head2.data) && checkingIdentical(head1.next,head2.next);
        }
        return false;
    }

    void Insert(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }


    public static void main(String args[]){

        IdenticalLinkedList identicalLinkedList=new IdenticalLinkedList();

        IdenticalLinkedList identicalLinkedList1=new IdenticalLinkedList();

        identicalLinkedList.Insert(10);
        identicalLinkedList.Insert(20);
        identicalLinkedList.Insert(30);

        identicalLinkedList1.Insert(10);
        identicalLinkedList1.Insert(20);
        identicalLinkedList1.Insert(10);


        System.out.println(identicalLinkedList.checkingIdentical(identicalLinkedList.getHead(),identicalLinkedList1.getHead()));

    }


}
