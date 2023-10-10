package PrefixSum;
import java.io.*;
import java.util.StringTokenizer;

public class P_2003 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N+1];
        int sum[] = new int[N+1];
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i-1] + arr[i];
        }
        for(int i = 1; i<=N; i++){
            for(int j = i; j<=N; j++){
                if(sum[j]-sum[i-1] == M)
                    count++;
            }
        }
        bw.write(count+"");
        bw.flush();
    }

}
