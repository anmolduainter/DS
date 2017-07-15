package ExpressionTrees;

import java.util.Stack;

/**
 * Created by anmol on 15/7/17.
 */
public class ExpressionTrees {

    public ExpressionTreeNode Expression(char[] arr, int size){

        Stack<ExpressionTreeNode> S=new Stack();

        for (int i=0;i<size;i++){

            if (arr[i]=='A'||arr[i]=='B'||arr[i]=='C'){
                ExpressionTreeNode newnode=new ExpressionTreeNode();
                newnode.setData(arr[i]);
                newnode.setLeft(null);
                newnode.setRight(null);
                S.push(newnode);
                System.out.println(S);
            }
            else{

                ExpressionTreeNode t1=S.pop();
                ExpressionTreeNode t2=S.pop();
                ExpressionTreeNode newnode=new ExpressionTreeNode();
                newnode.setData(arr[i]);
                newnode.setRight(t2);
                newnode.setLeft(t1);
                S.push(newnode);
            }

        }


        return (ExpressionTreeNode) S.pop();

    }



    public void Inorder(ExpressionTreeNode root){

        if (root!=null){

            Inorder(root.getLeft());
            System.out.println(root.getData());
            Inorder(root.getRight());
        }


    }




}
