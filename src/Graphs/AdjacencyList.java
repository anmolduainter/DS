package Graphs;


//////////Adjacency List Implementation////////


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class AdjacencyList {


    Map<Integer,List<Integer>> map;

    AdjacencyList(int vertexCount){
        map=new HashMap<Integer,List<Integer>>();
        for (int i=0;i<vertexCount;i++){
            map.put(i,new LinkedList<Integer>());
        }
    }

    public void addEdge(int i,int j){

        if (i>map.size() || j>map.size()){
            System.out.println("No vertex");
            return;
        }

        List<Integer> slist=map.get(i);
        slist.add(j);
    }

    public void getEdges(int i){

        if (i>map.size()){
            System.out.println("No Vertex");
            return;
        }

        List<Integer> slist=map.get(i);

        for (int a=0;a<slist.size();a++){
            System.out.println(i+" -> "+slist.get(a));
        }

    }


    public static void main(String[] args){

        AdjacencyList adjacencyList=new AdjacencyList(4);
        adjacencyList.addEdge(0,1);
        adjacencyList.addEdge(0,3);
        adjacencyList.addEdge(1,2);
        adjacencyList.addEdge(2,0);
        adjacencyList.addEdge(2,3);
        adjacencyList.addEdge(3,3);

        adjacencyList.getEdges(3);

    }

}
