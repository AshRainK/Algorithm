package BackTracking;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class P_15654 {

    static int N,M;
    static int arr[];
    static boolean visited[];
    static int values[];
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visited = new boolean[N];
        values = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<N; i++)
            values[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(values);
        for(int i = 0; i<N; i++){
            dfs(i,0);
        }
        bw.write(sb.toString());
        bw.flush();
    }

    public static void dfs(int idx,int count){
        arr[count] = values[idx];
        if(count + 1 == M){
            for(int temp : arr)
                sb.append(temp+" ");
            sb.append("\n");
            return;
        }
        visited[idx] = true;
        for(int i = 0; i<N; i++){
            if(!visited[i])
                dfs(i,count+1);
        }
        visited[idx] = false;
    }

}
