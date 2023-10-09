package PrefixSum;
import java.io.*;
import java.util.StringTokenizer;

public class P_2559 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int arr[] = new int[N+1];
        int sum[] = new int[N+1];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 1; i<=N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i-1]+arr[i];
        }
        int result = Integer.MIN_VALUE;
        for(int i = 0; i<N-K+1; i++){
            result = Math.max(result,sum[K+i]-sum[i]);
        }
        bw.write(result+"");
        bw.flush();
    }

}
