package BackTracking;
import java.io.*;
import java.util.StringTokenizer;

public class P_15652 {

    static int N,M;
    static int arr[];
    static int count;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        for(int i = 1; i<=N; i++){
            count = 0;
            dfs(i);
        }
        bw.write(sb.toString());
        bw.flush();
    }

    static void dfs(int n){
        arr[count++] = n;
        if(count == M){
            count--;
            for(int temp : arr)
                sb.append(temp+" ");
            sb.append("\n");
            return;
        }
        for(int i = n; i<=N; i++){
            dfs(i);
        }
        count--;
    }

}
