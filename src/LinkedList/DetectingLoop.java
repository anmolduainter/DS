package LinkedList;


// Java program to detect loop in a linked list

public class DetectingLoop {


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
    int detectionLoop(){

        Node slow_p=head , fast_p=head;

        while(slow_p!=null && fast_p!=null && fast_p.next!=null){
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;
            if (slow_p==fast_p){
                System.out.println("Found Loop");
                return 1;
            }
        }

        System.out.println("No Loop");
        return 0;
    }

    public static void main(String[] args){

        DetectingLoop detectingLoop=new DetectingLoop();

        detectingLoop.push(10);
        detectingLoop.push(20);
        detectingLoop.push(30);
        detectingLoop.push(40);
        detectingLoop.push(50);

//        detectingLoop.head.next.next.next.next=detectingLoop.head.next;
        System.out.println(detectingLoop.detectionLoop());

    }

}
