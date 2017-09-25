package LinkedList;

/*
     5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45

 */

public class FlatteiningList {


    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    void insert(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }

    void PrintList(){

        Node temp=head;

        while(temp!=null){
            System.out.println(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("");
    }

    Node Flatten(Node root){

        return null;

    }



}
