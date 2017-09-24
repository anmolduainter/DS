package LinkedList;

public class FindingMiddleElement {

    Node head;

    class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
            next=null;
        }
    }

    void findMiddle(){
        Node slow_ptr=head;
        Node fast_ptr=head;

        while(fast_ptr!=null && fast_ptr.next!=null){
            fast_ptr=fast_ptr.next.next;
            slow_ptr=slow_ptr.next;
        }
        System.out.println("Middle Element : " + slow_ptr.data);
    }

    // Insertion at head
    void Insert(char data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }

    //Printing List

    void PrintList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " - > ");
            temp=temp.next;
        }

        System.out.println("");
    }

    public static void main(String[] args){

        FindingMiddleElement findingMiddleElement=new FindingMiddleElement();

        findingMiddleElement.Insert('a');
        findingMiddleElement.Insert('b');
        findingMiddleElement.Insert('c');
        findingMiddleElement.Insert('d');
        findingMiddleElement.Insert('e');

        findingMiddleElement.PrintList();

        findingMiddleElement.findMiddle();


    }

}
