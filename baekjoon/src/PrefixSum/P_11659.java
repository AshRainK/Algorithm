package PrefixSum;
import java.io.*;
import java.util.*;

public class P_11659 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N+1];
        int sum[] = new int[N+1];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 1; i<=N; i++){
            arr[i]  = Integer.parseInt(st.nextToken());
            sum[i] = sum[i-1]+arr[i];
        }
        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int result = sum[end-1]-sum[start-1]+arr[end];
            bw.write(result+"\n");
        }
        bw.flush();
    }

}
