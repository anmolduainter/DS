package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by anmol on 8/7/17.
 */
public class BinaryTree {


    public void InsertIntoTree(BinaryTreeNode root,int data){

        if (root==null){
            return;
        }

        Queue<BinaryTreeNode> q=new LinkedList<BinaryTreeNode>();
        q.offer(root);

        while (!q.isEmpty()) {

            BinaryTreeNode temp=q.poll();
            if (temp!=null){
                if (temp.getLeft()!=null){
                    q.offer(temp.getLeft());
                }
                else{
                    temp.left=new BinaryTreeNode(data);
                    return;
                }
                if (temp.getRight()!=null){
                    q.offer(temp.getRight());
                }
                else{
                    temp.right=new BinaryTreeNode(data);
                    return;
                }
            }

        }

    }



    public void Inorder(BinaryTreeNode root) {
        if (root != null) {
            Inorder(root.getLeft());
            System.out.print(root.getData()+" ");
            Inorder(root.getRight());
        }
    }


    //Recursive max value in Binary Tree

    public int MaximumValueRecursive(BinaryTreeNode root){

        int maxValue=Integer.MIN_VALUE;

        if (root!=null){

            int leftMax=MaximumValueRecursive(root.getLeft());
            int rightMax=MaximumValueRecursive(root.getRight());

            if (leftMax>rightMax){
                maxValue=leftMax;
            }
            else{
                maxValue=rightMax;
            }
            if (root.data>maxValue){
                maxValue=root.data;
            }

        }
        return maxValue;
    }


    //Not Recursive

    public int MaximumValueNoRecursive(BinaryTreeNode root){

        int maxValue=Integer.MIN_VALUE;

        if (root==null) return maxValue;

        else{

            Queue<BinaryTreeNode> q=new LinkedList<BinaryTreeNode>();
            q.offer(root);

            while (!q.isEmpty()){

                BinaryTreeNode temp=q.poll();

                if (temp!=null){
                    if (temp.getData()>maxValue){
                        maxValue=temp.getData();
                    }
                    if (temp.getLeft()!=null){
                        q.offer(temp.getLeft());
                    }
                    if (temp.getRight()!=null){
                        q.offer(temp.getRight());
                    }
                }

            }


        }

       return maxValue;
    }

    //Searching Recursive

    public boolean searchingRecursive(BinaryTreeNode root,int data){

        if (root!=null){
            if (root.data==data){
                return true;
            }
            else{
                 return searchingRecursive(root.getLeft(),data)|| searchingRecursive(root.getRight(),data);
            }
        }

        return false;
    }


    //SearchNotRecursive

    public boolean searchNoRecursive(BinaryTreeNode root,int data){

        if (root!=null){

            Queue<BinaryTreeNode> q=new LinkedList<BinaryTreeNode>();
            q.offer(root);
            while (!q.isEmpty()){

                BinaryTreeNode temp=q.poll();
                if (temp!=null){
                    if (temp.data==data){
                        return true;
                    }
                    if (temp.getLeft()!=null){
                        q.offer(temp.getLeft());
                    }
                    if (temp.getRight()!=null){
                        q.offer(temp.getRight());
                    }
                }

            }

        }

        return false;

    }


    //No Recursive way

   public int sizeOfTree(BinaryTreeNode root){

        int count=0;

        if (root!=null){

            Queue<BinaryTreeNode> q=new LinkedList<BinaryTreeNode>();
            q.offer(root);
            while (!q.isEmpty()){
                BinaryTreeNode temp=q.poll();
                count++;
                if (temp!=null){
                    if (temp.getLeft()!=null){
                        q.offer(temp.getLeft());
                    }
                    if (temp.getRight()!=null){
                        q.offer(temp.getRight());
                    }
                }
            }
        }
        return count;
   }

   //Recursive way


    public int sizeOfTreeRecur(BinaryTreeNode root){

       if (root!=null){
            int leftCount=root.left==null?0:sizeOfTreeRecur(root.getLeft());
            int rightCount=root.right==null?0:sizeOfTreeRecur(root.getRight());
            return 1+leftCount+rightCount;
       }

       return -1;
    }


    //Deletion in binary tree

    public void deleteBinaryTree(BinaryTreeNode root){
        root=null;
    }


    // Problem 1 :=  To print it into level order data in order...........


    public void printLeveOrder(BinaryTreeNode root){

        if (root!=null){
            Stack<BinaryTreeNode> s=new Stack<BinaryTreeNode>();
            Queue<BinaryTreeNode> q=new LinkedList<BinaryTreeNode>();
            q.offer(root);
            while(!q.isEmpty()){
                BinaryTreeNode temp=q.poll();
                if (temp.getRight()!=null){
                    q.offer(temp.getRight());
                }
                if (temp.getLeft()!=null){
                   q.offer(temp.getLeft());
                }
                s.push(temp);
            }

            while(!s.isEmpty()){
                System.out.print(" "+s.pop().getData()+" ");
            }

        }

    }



    // Problem 2 :=  To print it into level order data in reverse order...........


    public void printLeveOrderReverese(BinaryTreeNode root){

        if (root!=null){
            Stack<BinaryTreeNode> s=new Stack<BinaryTreeNode>();
            Queue<BinaryTreeNode> q=new LinkedList<BinaryTreeNode>();
            q.offer(root);
            while(!q.isEmpty()){
                BinaryTreeNode temp=q.poll();
                if (temp.getLeft()!=null){
                    q.offer(temp.getLeft());
                }
                if (temp.getRight()!=null){
                    q.offer(temp.getRight());
                }
                s.push(temp);
            }

            while(!s.isEmpty()){
                System.out.print(" "+s.pop().getData()+" ");
            }

        }

    }



   // Problem 3:= Height of a node

    public int HeightOfANode(BinaryTreeNode root){

        int heightCount=-1;

        if (root!=null){

            int leftCount=HeightOfANode(root.getLeft());
            int rightCount=HeightOfANode(root.getRight());

            if (leftCount>=rightCount){
                heightCount=leftCount;
            }
            else {
                heightCount=rightCount;
            }
        }

        return heightCount;
    }

}
