package Graph;

import java.io.*;
import java.util.StringTokenizer;

public class P_1012 {

    static int M;
    static int N;
    static int arr[][];
    static boolean visited[][];
    static int dx[] = {0,0,1,-1};
    static int dy[] = {1,-1,0,0};


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i<T; i++){
            st = new StringTokenizer(br.readLine()," ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            arr = new int[N][M];
            visited = new boolean[N][M];
            int count = 0;
            for(int j = 0; j<K; j++){
                st = new StringTokenizer(br.readLine()," ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
            }
            for(int j =0; j<N; j++){
                for(int k = 0; k<M; k++){
                    if(!visited[j][k]&&arr[j][k]==1){
                        count++;
                        dfs(j,k);
                    }
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
    }


    public static void dfs(int y, int x){
        visited[y][x] = true;
        for(int i = 0; i<dx.length; i++){
            int newX = x+dx[i];
            int newY = y+dy[i];
            if(newX>=0 && newY>=0 && newX<M && newY<N){
                if(!visited[newY][newX] && arr[newY][newX] == 1)
                    dfs(newY,newX);
            }
        }
    }

}
