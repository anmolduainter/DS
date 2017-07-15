package ExpressionTrees;

/**
 * Created by anmol on 15/7/17.
 */
public class ExpressionTreeNode {

    ExpressionTreeNode left;
    ExpressionTreeNode right;
    char data;

    public ExpressionTreeNode(){

    }

    public ExpressionTreeNode(char data){

        this.data=data;
        left=null;
        right=null;

    }


    public ExpressionTreeNode getLeft() {
        return left;
    }

    public void setLeft(ExpressionTreeNode left) {
        this.left = left;
    }

    public ExpressionTreeNode getRight() {
        return right;
    }

    public void setRight(ExpressionTreeNode right) {
        this.right = right;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }
}
