package Graph;

import java.io.*;
import java.util.Arrays;

public class P_2667 {

    static boolean visited[][];
    static int count[];
    static int idx;
    static int dx[] = {0,0,1,-1};
    static int dy[] = {1,-1,0,0};
    static int N;
    static int arr[][];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];
        count = new int[N*N];
        for(int i = 0; i<N; i++){
            String str = br.readLine();
            for(int j = 0; j<N; j++)
                arr[i][j] = str.charAt(j)-'0';
        }
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if(arr[i][j] == 1 && !visited[i][j]) {
                    idx++;
                    dfs(i, j);
                }
            }
        }
        bw.write(idx+"\n");
        Arrays.sort(count);
        for(int i = 0 ; i<count.length; i++){
            if(count[i] == 0)
                continue;
            bw.write(count[i]+"\n");
        }
        bw.flush();
    }


    public static void dfs(int x, int y){
        visited[x][y] = true;
        count[idx]++;
        for(int i = 0; i<dx.length; i++){
            int newX = x+dx[i];
            int newY = y+dy[i];
            if(newX >=0 && newY >=0 && newX<N && newY<N){
                if(arr[newX][newY] == 1 && !visited[newX][newY])
                    dfs(newX,newY);
            }
        }
    }


}
