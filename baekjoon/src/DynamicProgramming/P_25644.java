package DynamicProgramming;
import java.io.*;
import java.util.StringTokenizer;

public class P_25644 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int[N];
        int dp[] = new int[N+1];
        for(int i = 0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int max = 0;
        for(int i = 0; i<N; i++){
            if(i == 0){
                dp[i] = arr[i];
            }
            else {
                dp[i] = Math.min(arr[i], dp[i - 1]);
                max = Math.max(max,arr[i] - dp[i]);
            }
        }
        bw.write(max+"");
        bw.flush();
    }

}
