package DynamicProgramming;

import java.io.*;

public class P_13699 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long dp[] = new long[n+2];
        dp[0] = 1;
        dp[1] = 1;
        for(int i =2; i<=n; i++){
            for(int j = 0; j<i; j++)
                dp[i] += dp[j]*dp[i-j-1];
        }
        bw.write(dp[n]+"");
        bw.flush();
    }

}
