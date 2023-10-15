package BackTracking;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P_15650 {

    static int N;
    static int max;
    static int count = 0;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    static boolean visited[];
    static int arr[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        max = Integer.parseInt(st.nextToken());
        arr = new int[max];
        visited = new boolean[N+1];
        for(int i = 0; i<=N; i++)
            adj.add(new ArrayList<>());
        for(int i = 1; i<=N; i++){
            for(int j = i+1; j<=N; j++){
                adj.get(i).add(j);
            }
        }
        for(int i = 1; i<=N; i++)
            Collections.sort(adj.get(i));
        for(int i = 1; i<=N; i++){
            count = 0;
            dfs(i);
        }
        bw.write(sb.toString());
        bw.flush();
    }

    static void dfs(int vertex){
        arr[count] = vertex;
        count++;
        if(count == max){
            for(int i : arr)
                sb.append(i+" ");
            sb.append("\n");
            count --;
            return;
        }
        visited[vertex] = true;
        for(int i = 0; i<adj.get(vertex).size(); i++){
            int v = adj.get(vertex).get(i);
            if(!visited[v]){
                dfs(v);
            }
        }
        visited[vertex] = false;
        count --;
    }

}
