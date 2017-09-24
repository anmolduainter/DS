package LinkedList;


public class Palindrome {

    // Head of list
    Node head;

    Node slowPtr,fastPtr,secondHalf;

    class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
            next=null;
        }
    }

    //Method to check the Palindrome

    boolean isPalindrome(){

        slowPtr=head; fastPtr=head;

        Node prev_of_slowPtr=head;

        Node midNode=null;

        boolean result=true;

        if (head!=null & head.next!=null){

            while(fastPtr!=null && fastPtr.next!=null){
                fastPtr=fastPtr.next.next;
                prev_of_slowPtr=slowPtr;
                slowPtr=slowPtr.next;
            }

            if (fastPtr!=null){
                midNode=slowPtr;
                slowPtr=slowPtr.next;
            }

            // Compares the second half

            secondHalf=slowPtr;
            prev_of_slowPtr.next=null;

            //calling reverse
            reverse();

            result=compareList(head,secondHalf);

            // Again Calling reverse to restore the list
            reverse();

            if (midNode!=null){
                prev_of_slowPtr.next=midNode;
                midNode.next=secondHalf;
            }

            else{
                prev_of_slowPtr.next=secondHalf;
            }

        }

        return result;
    }


    // Reversing Of a linked list (done in another class)
    void reverse(){

        Node prev=null;
        Node curr=secondHalf;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        secondHalf = prev;
    }


    // Comparing List
    boolean compareList(Node head1,Node head2){

        Node temp1=head1;
        Node temp2=head2;

        while(temp1!=null && temp2!=null){

            if (temp1.data==temp2.data){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else{
                return false;
            }

        }

        if (temp1==null && temp2 ==null){
            return true;
        }

        return false;
    }


    void Insert(char data){
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

        Palindrome palindrome=new Palindrome();

        palindrome.Insert('a');
        palindrome.Insert('a');
        palindrome.Insert('b');
        palindrome.Insert('a');
        //palindrome.Insert('a');

        palindrome.PrintList();

        System.out.println(palindrome.isPalindrome());

    }
}
