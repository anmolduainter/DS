import BST.BinaryTree;
import BST.BinaryTreeNode;
import com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl;

/**
 * Created by anmol on 8/7/17.
 */
public class Main {

    public static void main(String[] args){

        BinaryTreeNode root=new BinaryTreeNode(2);
        BinaryTree binaryTree=new BinaryTree();

        binaryTree.InsertIntoTree(root,3);
        binaryTree.InsertIntoTree(root,4);
        binaryTree.InsertIntoTree(root,5);
        binaryTree.InsertIntoTree(root,6);
        binaryTree.InsertIntoTree(root,7);
        binaryTree.InsertIntoTree(root,8);
        binaryTree.InsertIntoTree(root,9);


        binaryTree.Inorder(root);
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




    }

}
