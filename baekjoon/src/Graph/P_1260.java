package Graph;
import java.io.*;
import java.util.*;

public class P_1260 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str[] = br.readLine().split(" ");
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int V = Integer.parseInt(str[2]);
        boolean dfsVisited[] = new boolean[N+1];
        boolean bfsVisited[] = new boolean[N+1];
        List<LinkedList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<=N; i++)
            adj.add(new LinkedList<Integer>());
        for(int i = 0; i<M; i++){
            str = br.readLine().split(" ");
            int idx1 = Integer.parseInt(str[0]);
            int idx2 = Integer.parseInt(str[1]);
            adj.get(idx1).add(idx2);
            adj.get(idx2).add(idx1);
        }
        for(int i = 1; i<=N; i++)
            Collections.sort(adj.get(i));
        queue.add(V);
        dfs(adj,V,dfsVisited);
        sb.append("\n");
        bfs(adj,bfsVisited,queue);
        bw.write(sb.toString());
        bw.flush();
    }

    public static void dfs(List<LinkedList<Integer>> adj, int idx, boolean[] visited){
        sb.append(idx+" ");
        visited[idx] = true;
        List<Integer> list = adj.get(idx);
        for(int i = 0; i<list.size(); i++){
            int vertex = list.get(i);
            if(!visited[vertex])
                dfs(adj,vertex,visited);
        }
    }


    public static void bfs(List<LinkedList<Integer>> adj, boolean[] visited,Queue<Integer> queue){
        if(queue.isEmpty())
            return;
        int idx = queue.poll();
        if(!visited[idx])
            sb.append(idx+" ");
        visited[idx] = true;
        List<Integer> list = adj.get(idx);
        for(int i = 0; i<list.size(); i++){
            int vertex = list.get(i);
            if(!visited[vertex]){
                queue.add(vertex);
            }
        }
        bfs(adj,visited,queue);
    }
}
