import BST.BinaryTree;
import BST.BinaryTreeNode;

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


        binaryTree.Inorder(root);
        System.out.println("..............................");

        System.out.println(binaryTree.MaximumValueRecursive(root));
        System.out.println(binaryTree.MaximumValueNoRecursive(root));

        System.out.println(binaryTree.searchingRecursive(root,6));
        System.out.println(binaryTree.searchNoRecursive(root,7));
    }

}
