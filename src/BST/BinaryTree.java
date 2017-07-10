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

        if (root==null){
            return 0;
        }

        int leftCount=HeightOfANode(root.left);
        int rightCount=HeightOfANode(root.right);
        return (leftCount>rightCount)?leftCount+1:rightCount+1;

    }


    //Problem 4:= Height of a node without recursion

    public int HeightWithouRecur(BinaryTreeNode root){

        int count=1;
        int count1=1;
        if (root!=null){

            Queue<BinaryTreeNode> q=new LinkedList<BinaryTreeNode>();

            q.offer(root);
            q.offer(null);
            while(!q.isEmpty()){

                BinaryTreeNode temp=q.poll();

                if (temp!=null){
                    if (temp.left==null && temp.right==null){
                        count1=count;
                    }
                    if (temp.getLeft()!=null){
                        q.offer(temp.getLeft());
                    }
                    if (temp.getRight()!=null){
                        q.offer(temp.getRight());
                    }

                }
                else {
                    if (!q.isEmpty()){
                        count++;
                        q.offer(null);

                    }
                }

            }

        }

        return count1;
    }


    //Problem 5:=rightest deepest Node Finding


    public int DeepestNode(BinaryTreeNode root) {

        BinaryTreeNode temp = null;

        if (root != null) {

            Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
            q.offer(root);
            while (!q.isEmpty()) {
                temp = q.poll();
                if (temp.getLeft() != null) {
                    q.offer(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    q.offer(temp.getRight());
                }
            }
        }

        return temp.getData();

    }


    //Problem 6:= Count the no. of full nodes in a binary tree including root

    public int CountFullNodes(BinaryTreeNode root){

        int count=0;

        if (root!=null){

            Queue<BinaryTreeNode> q=new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){

                BinaryTreeNode temp=q.poll();
                if (temp.getLeft()!=null && temp.getRight()!=null){
                    count++;
                }
                if (temp.getLeft()!=null){
                    q.offer(temp.getLeft());
                }
                if (temp.getRight()!=null){
                    q.offer(temp.getRight());
                }

            }

        }

        return count+1;

    }

    //Problem 7:= Count the no. of half nodes without checking root


    public int CountHalfNodes(BinaryTreeNode root){

        int count=0;

        if (root!=null){

            Queue<BinaryTreeNode> q=new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){

                BinaryTreeNode temp=q.poll();
                if ((temp.getLeft()==null && temp.getRight()!=null)||
                        (temp.getLeft()!=null && temp.getRight()==null)){
                    count++;
                }
                if (temp.getLeft()!=null){
                    q.offer(temp.getLeft());
                }
                if (temp.getRight()!=null){
                    q.offer(temp.getRight());
                }

            }

        }

        return count;

    }


    //Problem 8:=Diameter of a tree(No.of nodes on the longestPath between leafs )


    public int DiameterOfaTree(BinaryTreeNode root){

        if (root!=null){

            int len1=HeightOfANode(root.getLeft())+HeightOfANode(root.getRight())+1;
            int len2=Math.max(DiameterOfaTree(root.left),DiameterOfaTree(root.right));
            return (Math.max(len1,len2));
        }

        return 0;
    }


    //Problem 9:= Print out all roots to leafs Path.................

    public void PrintPaths(BinaryTreeNode root){
        int[] paths=new int[256];
        PrintPaths(root,paths,0);
    }
    public void PrintPaths(BinaryTreeNode root,int[] arr,int PathLen){

        if (root!=null){
            arr[PathLen]=root.getData();
            PathLen++;
            if (root.getLeft()==null&&root.getRight()==null){
                printArray(arr,PathLen);
            }
            else{

                PrintPaths(root.getLeft(),arr,PathLen);
                PrintPaths(root.getRight(),arr,PathLen);
            }
        }

    }

    public void printArray(int[] arr,int le){

             for (int i=0;i<le;i++){

                 System.out.println(" "+arr[i]);

        }

    }


    //Problem 10:=checking the existence of path with given sum

    public boolean CheckPathSum(BinaryTreeNode root, int sum){

        if (root!=null){

            if (root.getLeft()==null && root.getRight()==null && root.getData()==sum){
                return true;
            }
            else{
                return (CheckPathSum(root.getLeft(),sum-root.getData())||CheckPathSum(root.getRight(),sum-root.getData()));
            }

        }

        return false;
    }


    //Problem 11:= Sum of all nodes in a tree

    public int SumOfAllNodes(BinaryTreeNode root){

        if (root!=null){

            return root.getData()+SumOfAllNodes(root.getLeft())+SumOfAllNodes(root.getRight());

        }
     return 0;
    }

    //problem 12:=Mirror of a tree

    public BinaryTreeNode MirrorofTree(BinaryTreeNode root){
        if (root!=null){

            MirrorofTree(root.getLeft());
            MirrorofTree(root.getRight());

            BinaryTreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            System.out.print(root.getData()+ " ");
        }
        return root;

    }


    //problem 13:=Check wheteher the two trees are mirrors of each other


    public boolean CheckMirrors(BinaryTreeNode root1, BinaryTreeNode root2){


            if (root1==null && root2==null){
                return true;
            }

            if (root1==null || root2==null){
                return false;
            }
            else return CheckMirrors(root1.getLeft(),root2.getRight()) && CheckMirrors(root1.getRight(),root2.getLeft());


    }


}
