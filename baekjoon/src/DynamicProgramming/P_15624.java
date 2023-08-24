package DynamicProgramming;

import java.io.*;

public class P_15624 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long dp[] = new long[n+2];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i<=n; i++)
            dp[i] = (dp[i-1] + dp[i-2])%1000000007;
        bw.write(dp[n]+"");
        bw.flush();
    }

}
