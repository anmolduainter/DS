package ThreadedBinaryTrees;

/**
 * Created by anmol on 15/7/17.
 */
public class ThreadedTrees {

    public void InsertRightInorder(ThreadedBinaryTreeNode P,ThreadedBinaryTreeNode Q){

        ThreadedBinaryTreeNode temp;
        Q.setRight(P.getRight());
        Q.setRTag(P.getRTag());
        Q.setLTag(0);
        Q.setLeft(P);
        P.setRight(Q);
        P.setRTag(1);

        if (Q.getRTag()==1){
            temp=Q.getRight();
            while(temp.getLTag()==1){
                temp=temp.getLeft();
            }
            temp.setLeft(Q);
        }


    }


    public void InsertLeftInorder(ThreadedBinaryTreeNode P, ThreadedBinaryTreeNode Q){

        ThreadedBinaryTreeNode temp;


    }



}
