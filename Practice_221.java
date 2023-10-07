import java.util.*;
public class Practice_221 {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));

        graph[4].add(new Edge(4,2));
    }
    public static boolean detectCycle(ArrayList<Edge> Graph[]){
        boolean visit[]=new boolean[Graph.length];
        for(int i=0;i<Graph.length;i++){//diff components
            if(!visit[i]){
                if(detectCycleUtil(Graph,visit,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge> Graph[],boolean visit[],int curr,int parent){
        visit[curr]=true;
        for(int i=0;i<Graph[curr].size();i++){
            Edge e=Graph[curr].get(i);
            if(!visit[e.dest]&&detectCycleUtil(Graph,visit,e.dest,curr)){
                return true;
            }
            else if(visit[e.dest] && e.dest!=parent){
                return true;
            }
        }
        return false;
    }
    // public static void bFS(ArrayList<Edge> graph[]){
    //     Queue<Integer> q=new LinkedList<>();
    //     boolean[] vis=new boolean[graph.length];
    //     q.add(0);//Source Add
    //     while(!q.isEmpty()){
    //         int curr=q.remove();
    //         if(!vis[curr]){
    //             System.out.print(curr+" ");
    //             vis[curr]=true;
    //             for(int i=0;i<graph[curr].size();i++){
    //                 Edge e=graph[curr].get(i);
    //                 q.add(e.dest);              
    //             }
    //         }
    //     }
    // }
    
    public static void main(String[] args){
        int V=5;
        ArrayList<Edge> []graph=new ArrayList[V];
        createGraph(graph);
        //bFS(graph);
        System.out.println(detectCycle(graph));
    }
}
