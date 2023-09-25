package Graph;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P_24480 {

    static List<ArrayList<Integer>> adj = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static int visited[];
    static int n;
    static int m;
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        visited = new int[n+1];
        for(int i = 0; i<=n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
        }
        for(int i = 1; i<=n; i++){
            ArrayList<Integer> list = adj.get(i);
            Collections.sort(list,Collections.reverseOrder());
        }
        dfs(r);
        for(int i = 1; i<visited.length; i++){
            sb.append(visited[i]+"\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }

    public static void dfs(int vertex){
        visited[vertex] = count++;
        ArrayList<Integer> list = adj.get(vertex);
        for(int i = 0; i<list.size(); i++){
            int v = list.get(i);
            if(visited[v]==0)
                dfs(v);
        }
    }

}
