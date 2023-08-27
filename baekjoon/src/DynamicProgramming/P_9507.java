package DynamicProgramming;

import java.io.*;

public class P_9507 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long dp[] = new long[68];
        dp[0] = dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i<=67; i++)
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3]+dp[i-4];
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T; i++){
            int n = Integer.parseInt(br.readLine());
            bw.write(dp[n]+"\n");
        }
        bw.flush();
    }

}
