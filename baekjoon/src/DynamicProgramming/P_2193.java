package DynamicProgramming;

import java.io.*;

public class P_2193 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long dp[] = new long[N+2];
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i<=N; i++)
            dp[i] = dp[i-1] + dp[i-2];
        bw.write(dp[N]+"");
        bw.flush();
    }

}
