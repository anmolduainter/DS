package LinkedList;


public class DetectingAndRemovingLoop {


    //head of list
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    // Inserting data before head in linked list
    public void push(int data){

      Node n=new Node(data);
      n.next=head;
      head=n;

    }


    // Method to detect Loop
    void detectionAndRemoveLoop(){

        Node slow_p=head , fast_p=head;

        boolean res=false;

        while(slow_p!=null && fast_p!=null && fast_p.next!=null){
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;
            if (slow_p==fast_p){
                System.out.println("Found Loop");
                res=true;
                break;
            }
        }

        // if loop present
        if (res){
            slow_p=head;
            while (slow_p.next!=fast_p.next){
                slow_p=slow_p.next;
                fast_p=fast_p.next;
            }
            fast_p.next=null;
        }

    }

    void PrintList(){

        Node temp=head;

        while (temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }

        System.out.println("");

    }


    public static void main(String[] args){

        DetectingAndRemovingLoop detectingAndRemovingLoop=new DetectingAndRemovingLoop();

        detectingAndRemovingLoop.push(10);
        detectingAndRemovingLoop.push(20);
        detectingAndRemovingLoop.push(30);
        detectingAndRemovingLoop.push(40);
        detectingAndRemovingLoop.push(50);

        detectingAndRemovingLoop.head.next.next.next.next.next=detectingAndRemovingLoop.head.next;

        detectingAndRemovingLoop.detectionAndRemoveLoop();

        detectingAndRemovingLoop.PrintList();

    }


}
