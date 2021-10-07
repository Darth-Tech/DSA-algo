package Collections.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {
    private int v;
    private LinkedList<Integer> adj[];

    BreadthFirstSearch(int v){
        this.v=v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList();
        }

    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void BFS(int s){
        boolean visited[]=new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);
        while(queue.size()!=0){
            s = queue.poll();
            System.out.println(s+" ");
            Iterator<Integer> i = adj[s].iterator();
            while(i.hasNext()){
                Integer n= i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
    public static void driverFunction()
    {
        BreadthFirstSearch g = new BreadthFirstSearch(4);

        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
    }
}
