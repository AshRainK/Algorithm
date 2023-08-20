package DynamicProgramming;

import java.io.*;

public class P_1699 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long dp[] = new long[N+3];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i = 4; i<=N; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j = 1; j<=Math.sqrt(i); j++){
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        bw.write(dp[N]+"");
        bw.flush();
    }

}
