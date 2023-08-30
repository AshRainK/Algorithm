package Graph;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P_2606adj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());
        String str[];
        List<LinkedList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<=N; i++)
            adj.add(new LinkedList<>());
        boolean visited[] = new boolean[N+1];
        int result = 0;
        for(int i = 0; i<edge; i++){
            str = br.readLine().split(" ");
            int idx1 = Integer.parseInt(str[0]);
            int idx2 = Integer.parseInt(str[1]);
            adj.get(idx1).add(idx2);
            adj.get(idx2).add(idx1);
        }
        for(int i = 1; i<=N; i++)
            Collections.sort(adj.get(i));

        dfs(adj,visited,adj.get(1));
        for(int i = 2; i<=visited.length-1; i++){
            if(visited[i])
                result++;
        }
        bw.write(result+"");
        bw.flush();
    }


    public static void dfs(List<LinkedList<Integer>> adj, boolean[] visited, List<Integer> list){
        for(int i = 0; i<list.size(); i++){
            int idx = list.get(i);
            if(!visited[idx]){
                visited[idx] = true;
                dfs(adj,visited,adj.get(idx));
            }
        }
    }
}
