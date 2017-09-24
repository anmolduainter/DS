package LinkedList;

public class IntersectionOfTwoLinkedList {


    static Node head1,head2;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    //getting Intersection

    int getNode(){

        int c1=getCount(head1);
        int c2=getCount(head2);

        if (c1>c2){
            int d=c1-c2;
            return getIntersectionNode(d,head1,head2);
        }
        else{
            int d=c2-c1;
            return getIntersectionNode(d,head2,head1);
        }
    }



    // getting Intersection Node
    int getIntersectionNode(int d,Node n1, Node n2){

        int i;
        Node curr1=n1;
        Node curr2=n2;

        for (i=0;i<d;i++){
            if (curr1==null){
                return -1;
            }
            curr1=curr1.next;
        }

        while(curr1!=null && curr2!=null){

            if (curr1.data==curr2.data){
                return curr1.data;
            }

            curr1=curr1.next;
            curr2=curr2.next;

        }

        return -1;

    }

    //getting count function
    int getCount(Node t){
        Node temp=t;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void main(String[] args){

        IntersectionOfTwoLinkedList intersectionOfTwoLinkedList=new IntersectionOfTwoLinkedList();
        intersectionOfTwoLinkedList.head1=new Node(2);
        intersectionOfTwoLinkedList.head1.next=new Node(3);
        intersectionOfTwoLinkedList.head1.next.next=new Node(4);
        intersectionOfTwoLinkedList.head1.next.next.next=new Node(5);

        intersectionOfTwoLinkedList.head2=new Node(4);
        intersectionOfTwoLinkedList.head2.next=head1.next.next;

        System.out.println("Intersection at : " + intersectionOfTwoLinkedList.getNode());

    }
}
