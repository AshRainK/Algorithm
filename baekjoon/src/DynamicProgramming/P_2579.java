package DynamicProgramming;

import java.io.*;

public class P_2579 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        long dp[] = new long[N+1];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = arr[0];
        for(int i = 2; i<=N; i++){
            if(i==2){
                dp[2] = dp[1] + arr[1];
            }
            else if(i==3){
                dp[3] = Math.max(dp[1]+arr[2],arr[1]+arr[2]);
            }
            else{
                dp[i] = Math.max(dp[i-3]+arr[i-2]+arr[i-1],dp[i-2]+arr[i-1]);
            }
        }
        bw.write(dp[N]+"");
        bw.flush();
    }

}
