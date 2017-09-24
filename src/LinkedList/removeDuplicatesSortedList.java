package LinkedList;


public class removeDuplicatesSortedList {

    Node head;

    //Constructor Node
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }


    // removing Duplicates
    void removeDuplicates(){

        Node temp=head;
        Node nextnext;
        while(temp.next!=null){
            if (temp.data==temp.next.data){
                nextnext=temp.next.next;
                temp.next=nextnext;
            }
            else{
                temp=temp.next;
            }
        }

    }


    void Insert(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
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

        removeDuplicatesSortedList removeDuplicatesSortedList=new removeDuplicatesSortedList();

        removeDuplicatesSortedList.Insert(10);
        removeDuplicatesSortedList.Insert(10);
        removeDuplicatesSortedList.Insert(20);
        removeDuplicatesSortedList.Insert(40);
        removeDuplicatesSortedList.Insert(40);

        removeDuplicatesSortedList.PrintList();

        removeDuplicatesSortedList.removeDuplicates();

        removeDuplicatesSortedList.PrintList();

    }


}
