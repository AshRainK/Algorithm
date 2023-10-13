package Graph;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class P_13023{

    static int N,M;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    static boolean visited[];
    static int count = 0;
    static boolean flag = false;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int count = 0;
        visited = new boolean[N];
        for(int i = 0; i<N; i++)
            adj.add(new ArrayList<>());
        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int idx1 = Integer.parseInt(st.nextToken());
            int idx2 = Integer.parseInt(st.nextToken());
            adj.get(idx1).add(idx2);
            adj.get(idx2).add(idx1);
        }
        for(int i = 0; i<N; i++){
            Collections.sort(adj.get(i));
        }
        for (int i = 0; i < N; i++) {
            dfs(i);
            if(flag)
                break;
            count = 0;
        }
        if(flag)
            bw.write("1");
        else
            bw.write("0");
        bw.flush();
    }

    public static void dfs(int vertex) {
        visited[vertex] = true;
        count++;
        if(count == 5){
            flag = true;
            return;
        }
        for (int i = 0; i < adj.get(vertex).size(); i++) {
            if(flag)
                break;
            int v = adj.get(vertex).get(i);
            if (!visited[v]) {
                dfs(v);
            }
        }
        visited[vertex] = false;
        count--;
    }

}
