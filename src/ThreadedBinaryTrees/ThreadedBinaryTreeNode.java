package ThreadedBinaryTrees;

/**
 * Created by anmol on 15/7/17.
 */
public class ThreadedBinaryTreeNode {

    ThreadedBinaryTreeNode left;
    int LTag;
    int data;
    int RTag;
    ThreadedBinaryTreeNode right;

    public ThreadedBinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(ThreadedBinaryTreeNode left) {
        this.left = left;
    }

    public int getLTag() {
        return LTag;
    }

    public void setLTag(int LTag) {
        this.LTag = LTag;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getRTag() {
        return RTag;
    }

    public void setRTag(int RTag) {
        this.RTag = RTag;
    }

    public ThreadedBinaryTreeNode getRight() {
        return right;
    }

    public void setRight(ThreadedBinaryTreeNode right) {
        this.right = right;
    }
}
