package Graph;

import java.io.*;
import java.util.*;

public class P_24479 {

    static int count;
    static int visited[];
    static List<ArrayList<Integer>> adj = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken()); // 정점 개수
        int M = Integer.parseInt(st.nextToken()); // 간선 개수
        int R = Integer.parseInt(st.nextToken()); // 시작
        visited = new int[N+1];
        for(int i = 0; i<=N; i++)
            adj.add(new ArrayList<>());
        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int v1 = Integer.parseInt(st.nextToken());;
            int v2 = Integer.parseInt(st.nextToken());;
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
        }
        for(int i = 1; i<=N; i++)
            Collections.sort(adj.get(i));
        count = 1;
        dfs(R);
        for(int i = 1; i<=N; i++)
            bw.write(visited[i]+"\n");
        bw.flush();
    }

    public static void dfs(int vertex){
        visited[vertex] = count;
        for(int i = 0; i<adj.get(vertex).size(); i++){
            int v = adj.get(vertex).get(i);
            if(visited[v] == 0){
                count++;
                dfs(v);
            }
        }
    }

}
