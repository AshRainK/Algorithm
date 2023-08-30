package Graph;

import java.io.*;

public class P_2606 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());
        String str[];
        int[][] matrix = new int[N+1][N+1];
        boolean visited[] = new boolean[N+1];
        int result = 0;
        for(int i = 0; i<edge; i++){
            str = br.readLine().split(" ");
            matrix[Integer.parseInt(str[0])][Integer.parseInt(str[1])]=1;
            matrix[Integer.parseInt(str[1])][Integer.parseInt(str[0])]=1;
        }
        dfs(1,matrix,visited);
        for(int i = 2; i<=visited.length-1; i++){
            if(visited[i])
                result++;
        }
        bw.write(result+"");
        bw.flush();
    }


    public static void dfs(int idx, int[][] matrix, boolean[] visited){
        int edge[] = matrix[idx];
        for(int i = 1; i<edge.length; i++){
            if(!visited[i] && edge[i] == 1){
                visited[i] = true;
                dfs(i,matrix,visited);
            }
        }
    }
}
