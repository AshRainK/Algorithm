package DynamicProgramming;

import java.io.*;

public class P_8394 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long dp[] = new long[n+2];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<=n; i++)
            dp[i] = (dp[i-1] + dp[i-2])%10;
        bw.write(dp[n]+"");
        bw.flush();
    }

}
