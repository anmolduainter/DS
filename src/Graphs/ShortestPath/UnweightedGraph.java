package Graphs.ShortestPath;

import java.util.LinkedList;
import java.util.Queue;

class UnweightGraph extends Graph{

    public void ShortestPath(Graph G,int s){

        //initialize queue
        Queue queue=new LinkedList();

        int v,w;

        //distance array to store distance
        int distance[]=new int[G.vertexCount];


        //Adding starting vertex into queue
        queue.add(s);

        for (int i=0;i<G.vertexCount;i++){
            distance[i]=-1;
        }

        distance[s]=0;

        while(!queue.isEmpty()){
            v= (int) queue.remove();
        }

    }

}

public class UnweightedGraph {

}
