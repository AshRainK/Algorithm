package Graph;

import java.io.*;
import java.util.*;

public class P_2644 {

    static List<ArrayList<Integer>> adj = new ArrayList<>();
    static int visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        visited = new int[n+1];
        for(int i = 0; i<=n; i++)
            adj.add(new ArrayList<>());
        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine()," ");
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
        }
        for(int i = 1; i<=n; i++)
            Collections.sort(adj.get(i));
        bfs(a);
        if(visited[a] == 0 || visited[b] == 0)
            bw.write("-1");
        else
            bw.write(Math.abs(visited[a]-visited[b])+"");
        bw.flush();
    }

    public static void bfs(int vertex){
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = adj.get(vertex);
        visited[vertex] = 1;
        for(int i = 0; i<list.size(); i++){
            int v = list.get(i);
            visited[v] = visited[vertex]+1;
            queue.add(v);
        }
        while(!queue.isEmpty()){
            int v = queue.poll();
            ArrayList<Integer> temp = adj.get(v);
            for(int i = 0; i < temp.size(); i++){
                int v2 = temp.get(i);
                if(visited[v2] == 0){
                    visited[v2] = visited[v]+1;
                    queue.add(v2);
                }
            }
        }
    }

}
