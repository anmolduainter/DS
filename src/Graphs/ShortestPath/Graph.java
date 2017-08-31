package Graphs.ShortestPath;

/**
 * Created by anmol on 31/8/17.
 */
class Graph {

    // Number of maximum vertices//
    private final int maxVertices=20;

    //List for vertices
    private Vertex vertexList[];

    //Adjacency Matrix for Edges//
    private int adjMatrix[][];

    //Keep track the count of vertices
    int vertexCount;

    public Graph(){

        vertexList=new Vertex[maxVertices];
        adjMatrix=new int[maxVertices][maxVertices];
        vertexCount=0;
        for (int i=0;i<maxVertices;i++){
            for (int j=0;j<maxVertices;j++){
                adjMatrix[i][j]=0;
            }
        }

    }

    //Method to add Vertex
    public void addVertex(char label){
        vertexList[vertexCount++]=new Vertex(label);
    }

    //Method to add Edge
    public void addEdge(int start,int end){
        adjMatrix[start][end]=1;
        adjMatrix[end][start]=1;
    }

    //Method to display Vertex
    public void displayVertex(int v){
        System.out.println(vertexList[v].label);
    }

    //Method to get Adjacent Vertex
    public int getAdjacentVertex(int v){
        for (int i=0;i<vertexCount;i++){
            if (adjMatrix[v][i]==1){
                return i;
            }
        }
        return -1;
    }

}
