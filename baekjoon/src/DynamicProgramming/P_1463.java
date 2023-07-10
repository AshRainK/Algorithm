package DynamicProgramming;

import java.io.*;

public class P_1463 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+1];
        dp[1] = 0;
        for(int i =2; i<=N; i++){
            dp[i] = dp[i-1]+1;
            if(i%3 == 0){
                dp[i] = Math.min(dp[i/3]+1,dp[i]);
            }
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i/2]+1,dp[i]);
            }
        }
        bw.write(dp[N]+"");
        bw.flush();
    }

}
