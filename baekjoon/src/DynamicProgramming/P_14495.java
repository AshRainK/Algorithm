package DynamicProgramming;

import java.io.*;

public class P_14495 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long dp[] = new long[n+3];
        dp[1] = dp[2] = dp[3] = 1;
        for(int i = 4; i<=n; i++)
            dp[i] = dp[i-1]+dp[i-3];
        bw.write(dp[n]+"");
        bw.flush();
    }

}
