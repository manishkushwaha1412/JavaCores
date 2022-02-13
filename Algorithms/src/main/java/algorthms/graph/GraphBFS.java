package algorthms.graph;

import java.util.*;

public class GraphBFS {

    private LinkedList<Integer> adjecent[];

    GraphBFS(int v){
        adjecent = new LinkedList[v];
        for (int i=0; i<v; i++){
            adjecent[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination){
        adjecent[source].add(destination);
        adjecent[destination].add(source);
    }

    public int bfs(int source, int destination){
        boolean visited[] = new boolean[adjecent.length];
        int parent[] = new int[adjecent.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        parent[source] = -1;
        visited[source] = true;

        while(!queue.isEmpty()){
            int current = queue.poll();
            if(current == destination) break;
            for(int neighbor : adjecent[current]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    parent[neighbor] = current;
                }
            }
        }

        int current = destination;
        int distance = 0;
        while(parent[current] != -1){
            System.out.print(current + " --> ");
            current = parent[current];
            distance ++ ;
        }

        return distance;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices and edges");
        int v = scanner.nextInt();
        int e = scanner.nextInt();
        GraphBFS graphBFS = new GraphBFS(v);
        System.out.println("Enter "+ e +" Edges");
        for(int i = 0; i<e; i++){
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graphBFS.addEdge(source, destination);
        }
        System.out.println("Enter the Source and Destination");
        int source = scanner.nextInt();
        int destination = scanner.nextInt();
        int distance = graphBFS.bfs(source, destination);
        System.out.println("distance is "+distance);
        scanner.close();

    }

}
