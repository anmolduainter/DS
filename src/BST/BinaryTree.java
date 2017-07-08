package BST;

import java.util.LinkedList;
import java.util.Queue;

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
            System.out.println(root.getData());
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

}
