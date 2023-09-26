package Graph;

import java.io.*;
import java.util.*;

public class P_24445 {

    static int count = 1;
    static int visited[];
    static List<ArrayList<Integer>> adj = new ArrayList<>();
    static int n, m;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        visited = new int[n+1];
        for(int i = 0; i<=n; i++)
            adj.add(new ArrayList<>());
        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int idx1 = Integer.parseInt(st.nextToken());
            int idx2 = Integer.parseInt(st.nextToken());
            adj.get(idx1).add(idx2);
            adj.get(idx2).add(idx1);
        }
        for(int i = 1; i<=n; i++)
            Collections.sort(adj.get(i),Collections.reverseOrder());
        bfs(r);
        for(int i = 1; i<=n; i++)
            bw.write(visited[i]+"\n");
        bw.flush();
    }

    public static void bfs(int vertex){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        visited[vertex] = count++;
        while(!queue.isEmpty()){
            int v = queue.poll();
            ArrayList<Integer> list = adj.get(v);
            for(int i = 0; i<list.size(); i++){
                if(visited[list.get(i)] == 0) {
                    queue.add(list.get(i));
                    visited[list.get(i)] = count++;
                }
            }
        }
    }

}
