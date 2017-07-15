package ThreadedBinaryTrees;

import javafx.geometry.Pos;

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
        Q.setLeft(P.getLeft());
        Q.setLTag(P.getLTag());
        Q.setRTag(0);
        Q.setRight(P);
        P.setLeft(Q);
        P.setLTag(1);

        if (Q.getLTag()==1){
            temp=Q.getLeft();
            while(temp.getRTag()==1){
                temp=temp.getRight();
            }
            temp.setRight(Q);
        }


    }



    public ThreadedBinaryTreeNode InorderSuccessor(ThreadedBinaryTreeNode P){

        ThreadedBinaryTreeNode Position;
        if (P.RTag==0){
            return P.getRight();
        }

        else{
            Position=P.getRight();
            while(Position.getLTag()==1){
                Position=Position.getLeft();
            }
            return Position;
        }

    }






}
