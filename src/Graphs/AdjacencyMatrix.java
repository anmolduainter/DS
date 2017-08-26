
/////////////Undirected Graph//////////////

package Graphs;

public class AdjacencyMatrix{

    private boolean adjMatrix[][];
    private int vertexCount;

    // Constructor to initialize  adjMatrix...

    AdjacencyMatrix(int vertexCount){
        this.vertexCount=vertexCount;
        adjMatrix=new boolean[vertexCount][vertexCount];
    }

    // Function to add Edge

    public void addEdge(int i,int j){
        if (i>=0 && i<vertexCount && j>=0 && j<vertexCount){
            adjMatrix[i][j]=true;
            adjMatrix[j][i]=true;
        }
    }

    //Function to remove Edge

    public void removeEdges(int i, int j){
        if (j>=0 && j<vertexCount && i>=0 && i<vertexCount ){
            adjMatrix[i][j]=false;
            adjMatrix[j][i]=false;
        }
    }

    //Function to find if there is an Edge

    public boolean isEdge(int i, int j){
        if (i>=0 && i<vertexCount && j>=0 && j<vertexCount){
            return adjMatrix[i][j];
        }
        else
            return false;
    }


    public static void main(String[] args){

        AdjacencyMatrix a=new AdjacencyMatrix(4);

        a.addEdge(0,0);
        a.addEdge(0,1);
        a.addEdge(0,2);
        a.addEdge(0,3);

        System.out.println(a.isEdge(0,0));  //true
        System.out.println(a.isEdge(0,1));  //true
        System.out.println(a.isEdge(0,2));  //true
        System.out.println(a.isEdge(0,3));  //true
        System.out.println(a.isEdge(1,2));  //false


    }

}