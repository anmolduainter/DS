package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by anmol on 8/7/17.
 */
public class BinaryTree {


    public void InsertIntoTree(BinaryTreeNode root, int data){

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


    //Problem 6:= Count the no. of full nodes in a binary tree

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

        return count;

    }

    //Problem 7:= Count the no. of half nodes


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

   //Problem 14:=Construct Binary tree from given inoreder and Post order traversals
    // Inorder := D B E A F C
    //PreOrder:= A B D E C F


    public BinaryTreeNode ConstructBinaryTree1(int[] inorder,int[] preorder){

        if (preorder.length==0 || preorder.length!=inorder.length){
            return null;
        }
        return buildBT(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    public BinaryTreeNode buildBT(int[] preOrder,int preStart,int preEnd,int[] inOrder,int inStart,int inEnd){

        int data=preOrder[preStart];
        BinaryTreeNode cur=new BinaryTreeNode(data);
        int offest=inStart;
        for (;offest<inEnd;offest++){
            if (inOrder[offest]==data){
                break;
            }
        }

        cur.left=buildBT(preOrder,preStart+1,preStart+offest-inStart,inOrder,inStart,offest-1);
        cur.right=buildBT(preOrder,preStart+offest-inStart+1,preEnd,inOrder,offest+1,inEnd);

        return cur;

    }


    //Problem 15:= Count the no. of binary trees give n nodes

    public int NoOfBinaryTrees(int n){

        int[] arr=new int[n+1];

        arr[0]=1;
        arr[1]=1;

        for (int i=2;i<=n;i++){
            for (int j=0;j<i;j++){
                arr[i]+=arr[j]*arr[i-j-1];
            }
        }

        return arr[n];
    }


    //Problem 16:= Leafs are denoted by L and internal nodes denoted by I (0 or 2 children) construct binary tree

    // preorder traversal given : ex :=ILILL

    public BinaryTreeNode question16(char[] A,int i){

        if (A==null){
            return null;
        }
        if (A.length==i){
            return null;
        }

         BinaryTreeNode newnode=new BinaryTreeNode();
         newnode.setData(A[i]);
         newnode.setLeft(null);
         newnode.setRight(null);

         if (A[i]=='L'){
             return newnode;
         }

         i=i+1;
         newnode.setLeft(question16(A,i));
         i=i+1;
         newnode.setRight(question16(A,i));
         return newnode;
    }


}
