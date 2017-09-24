package LinkedList;

// Problem in this

// program to merge two sorted linked lists

public class MergeTwoSortedLinkedList {

    Node head;

    class Node{
        int data;
        Node next;
        Node(){
            data=-1;
            next=null;
        }
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    Node getHead(){
        return head;
    }

    // Insertion at head
    void Insert(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }

    // Merging Two Linked List
     void MergeTwoLinkedList(Node l1,Node l2){

       // Node h=new Node();
        Node p=null;

        while(l1!=null || l2!=null){

            if (l1!=null && l2!=null){
                if (l1.data<l2.data){
                    p.next=l1;
                    l1=l1.next;
                }
                else{
                    p.next=l2;
                    l2=l2.next;
                }
               // p=p.next;
            }

            else if (l1==null){
                p.next=l2;
                break;
            }

            else if (l2==null){
                p.next=l1;
                break;
            }
        }

        head=p;
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

        MergeTwoSortedLinkedList mergeTwoSortedLinkedList=new MergeTwoSortedLinkedList();
        MergeTwoSortedLinkedList mergeTwoSortedLinkedList1=new MergeTwoSortedLinkedList();
        mergeTwoSortedLinkedList.Insert(10);
        mergeTwoSortedLinkedList.Insert(30);
        mergeTwoSortedLinkedList.Insert(50);
        mergeTwoSortedLinkedList.Insert(70);
        mergeTwoSortedLinkedList.Insert(90);


        mergeTwoSortedLinkedList1.Insert(20);
        mergeTwoSortedLinkedList1.Insert(40);
        mergeTwoSortedLinkedList1.Insert(60);
        mergeTwoSortedLinkedList1.Insert(80);
        mergeTwoSortedLinkedList1.Insert(100);


        mergeTwoSortedLinkedList.MergeTwoLinkedList(mergeTwoSortedLinkedList.getHead(),mergeTwoSortedLinkedList1.getHead());

        mergeTwoSortedLinkedList.PrintList();

    }

}
