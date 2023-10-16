package BackTracking;
import java.io.*;
import java.util.*;

public class P_15651 {

    static int N,M;
    static int count = 0;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        for(int i = 1; i<=N; i++){
            dfs(i);
        }
        bw.write(sb.toString());
        bw.flush();
    }

    static void dfs(int n){
        arr[count] = n;
        count++;
        if(count == M){
            for(int temp : arr)
                sb.append(temp+" ");
            sb.append("\n");
            count --;
            return;
        }
        for(int i = 1; i<=N; i++){
            dfs(i);
        }
        count--;
    }

}
