package Graphs;

import java.util.Stack;

//////////////// Vertex ///////////////////
class Vertex{
    public char label;
    public boolean visited;

    public Vertex(char label) {
        this.label = label;
        visited=false;
    }
}


///////////////// GRAPH ////////////////////
class Graph{

    // max no. of vertices we are taking it as 20
    private final int maxVertices=20;

    // vertex list to store all vertices(nodes)
    private Vertex vertexList[];

    //Adjacency Matrix for edges
    private int adjMatrix[][];

    //To keep track of vertex count
    private int vertexCount;

    //In DFS we use stack
    private Stack theStack;

    // Constructor to initailize all the things
    public Graph(){

        vertexList=new Vertex[maxVertices];
        vertexCount=0;
        adjMatrix=new int[maxVertices][maxVertices];
        theStack=new Stack();
        for (int i=0;i<maxVertices;i++){
            for (int j=0;j<maxVertices;j++){
                adjMatrix[i][j]=0;
            }
        }

    }

    //Method to add Vertex (return type void)(input char label)
    public void addVertex(char label){
        vertexList[vertexCount++]=new Vertex(label);
    }

    //Method to add Edge(int start,int end)
    public void addEdge(int start,int end){
        adjMatrix[start][end]=1;
        adjMatrix[end][start]=1;
    }

    //Method to see Edges at vertex
    public void getEdges(int v){
        for (int i=0;i<vertexCount;i++){
           if (adjMatrix[v][i]==1){
               System.out.println(vertexList[v].label + " - > " + vertexList[i].label);
           }
        }
    }

    //Method to displayVertex(int v)
    public void displayVertex(int v){
        System.out.println(vertexList[v].label);
    }

    //Method dfs (Graph Traversal)
    //Main thing starts here
    public void dfs(){

        vertexList[0].visited=true;
        displayVertex(0);
        theStack.push(0);

        while(!theStack.isEmpty()){

            System.out.println("Stack : " + theStack.peek());
            int v=getAdjacentUnvisitedVertex((Integer) theStack.peek());
            System.out.println("V : " + v);
            if (v==-1){
                theStack.pop();
            }
            else{
                vertexList[v].visited=true;
                displayVertex(v);
                theStack.push(v);
            }

        }

        // Reset Flags
        for (int i=0;i<vertexCount;i++){
            vertexList[i].visited=false;
        }

    }

    //Method to find Adjacent unvisited vertex...

    public int getAdjacentUnvisitedVertex(int v){

        for (int i=0;i<vertexCount;i++){
            if (adjMatrix[v][i]==1 && vertexList[i].visited==false){
                return i;
            }
        }

        return -1;
    }

}

public class DFS {

    public static void main(String[] args){

        Graph graph=new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,1);

        graph.getEdges(0);

        graph.dfs();
    }


}
