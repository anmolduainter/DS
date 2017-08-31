package Graphs;


import java.util.LinkedList;
import java.util.Queue;

//////////////// Vertex ///////////////////
class VertexBFS{
    public char label;
    public boolean visited;

    public VertexBFS(char label) {
        this.label = label;
        visited=false;
    }
}


///////////////// GRAPH ////////////////////
class GraphBFS{

    // max no. of vertices we are taking it as 20
    private final int maxVertices=20;

    // vertex list to store all vertices(nodes)
    private VertexBFS vertexList[];

    //Adjacency Matrix for edges
    private int adjMatrix[][];

    //To keep track of vertex count
    private int vertexCount;

    //In BFS we use Queue
    private Queue queue;

    // Constructor to initailize all the things
    public GraphBFS(){

        vertexList=new VertexBFS[maxVertices];
        vertexCount=0;
        adjMatrix=new int[maxVertices][maxVertices];
        queue=new LinkedList();
        for (int i=0;i<maxVertices;i++){
            for (int j=0;j<maxVertices;j++){
                adjMatrix[i][j]=0;
            }
        }

    }

    //Method to add Vertex (return type void)(input char label)
    public void addVertex(char label){
        vertexList[vertexCount++]=new VertexBFS(label);
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

    //Method bfs (Graph Traversal)
    //Main thing starts here
    public void bfs(){

        vertexList[0].visited=true;
        displayVertex(0);
        queue.add(0);
        int v2;

        while(!queue.isEmpty()){
            int v1= (int) queue.remove();
            while((v2=getAdjacentUnvisitedVertex(v1))!=-1){
                vertexList[v2].visited=true;
                displayVertex(v2);
                queue.add(v2);
            }
        }

        //Reset Flags

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

//////////Main Class////////
public class BFS {

    public static void main(String[] args){

        GraphBFS graphBFS=new GraphBFS();

        graphBFS.addVertex('A');
        graphBFS.addVertex('B');
        graphBFS.addVertex('C');
        graphBFS.addVertex('D');

        graphBFS.addEdge(0,1);
        graphBFS.addEdge(1,2);
        graphBFS.addEdge(2,3);
        graphBFS.addEdge(3,1);

        graphBFS.bfs();

    }

}
