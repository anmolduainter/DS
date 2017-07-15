
import ExpressionTrees.ExpressionTrees;

/**
 * Created by anmol on 8/7/17.
 */
public class Main {

    public static void main(String[] args){

//        BinaryTreeNode root=new BinaryTreeNode(2);
//        BinaryTree binaryTree=new BinaryTree();
//
//        binaryTree.InsertIntoTree(root,3);
//        binaryTree.InsertIntoTree(root,4);
//        binaryTree.InsertIntoTree(root,5);
//        binaryTree.InsertIntoTree(root,6);
//        binaryTree.InsertIntoTree(root,7);
//        binaryTree.InsertIntoTree(root,8);
//        binaryTree.InsertIntoTree(root,9);



//        BinaryTreeNode root1=new BinaryTreeNode(2);
//        BinaryTree binaryTree1=new BinaryTree();
//
//        binaryTree1.InsertIntoTree(root1,3);
//        binaryTree1.InsertIntoTree(root1,4);
//        binaryTree1.InsertIntoTree(root1,5);
//        binaryTree1.InsertIntoTree(root1,6);
//        binaryTree1.InsertIntoTree(root1,7);
//        binaryTree1.InsertIntoTree(root1,8);
//        binaryTree1.InsertIntoTree(root1,9);
//
//
//        binaryTree.Inorder(root1);
//        System.out.println("..............................");
//
//        System.out.println(binaryTree.MaximumValueRecursive(root));
//        System.out.println(binaryTree.MaximumValueNoRecursive(root));
//
//        System.out.println(binaryTree.searchingRecursive(root,6));
//        System.out.println(binaryTree.searchNoRecursive(root,7));
//
//        System.out.println("...................");
//        System.out.println(binaryTree.sizeOfTree(root));
//
//        System.out.println(binaryTree.sizeOfTreeRecur(root));
//
//        binaryTree.printLeveOrder(root);

//        System.out.println(binaryTree.HeightOfANode(root));
//        System.out.println(binaryTree.HeightWithouRecur(root));
//
//        System.out.println("......................");
//          System.out.println(binaryTree.DeepestNode(root));

//
//        System.out.println("......................");
//        System.out.println(binaryTree.CountFullNodes(root));

//
//        System.out.println("......................");
//        System.out.println(binaryTree.DiameterOfaTree(root));

//
//        System.out.println("......................");
//       binaryTree.PrintPaths(root);
//

//
//        System.out.println("......................");
//        System.out.println(binaryTree.CheckPathSum(root,12));
//

//
//        System.out.println("......................");
//        System.out.println(binaryTree.SumOfAllNodes(root));


//
//        System.out.println("......................");
//        System.out.println(binaryTree.MirrorofTree(root));
//
//
//        System.out.println("......................");
//        binaryTree.Inorder(root);
//


 //       System.out.println(binaryTree.CheckMirrors(root,root1));
//
//        int a[]=new int[10];
//        int b[]=new int[10];
//
//        binaryTree.buildBT(,);
//


    //    System.out.println(binaryTree.NoOfBinaryTrees(3));

//        BinaryTree binaryTree=new BinaryTree();
//        char[] ch=new char[5];
//        ch[0]='I';
//        ch[1]='L';
//        ch[2]='I';
//        ch[3]='L';
//        ch[4]='L';
//        BinaryTreeNode node=binaryTree.question16(ch,0);
//        binaryTree.printLeveOrder(node);
//


        ExpressionTrees expressionTrees=new ExpressionTrees();
        char[] a=new char[5];
        a[0]='A';
        a[1]='B';
        a[2]='C';
        a[3]='*';
        a[4]='-';
        expressionTrees.Inorder(expressionTrees.Expression(a,5));

    }

}
