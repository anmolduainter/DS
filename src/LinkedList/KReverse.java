package LinkedList;


public class KReverse {


    Node head;


    // class Node
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }


    // Inserting into List
    void Insert(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
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


    Node reverseL(Node n,int k){

        Node prev=null;
        Node current=n;
        Node next=null;

        int count=0;
        //Reverse the list

        while(count<k && current!=null){

            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }

        if (next!=null){
            n.next=reverseL(next,k);
        }

        return prev;

    }

    public static void main(String[] args){

        KReverse kReverse=new KReverse();

        kReverse.Insert(10);
        kReverse.Insert(20);
        kReverse.Insert(30);
        kReverse.Insert(40);
        kReverse.Insert(50);
        kReverse.Insert(60);
        kReverse.Insert(70);
        kReverse.Insert(80);


        kReverse.PrintList();

        System.out.println(" ");

        kReverse.head=kReverse.reverseL(kReverse.head,1);

        kReverse.PrintList();

    }

}
