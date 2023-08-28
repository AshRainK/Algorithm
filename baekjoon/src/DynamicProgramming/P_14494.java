package DynamicProgramming;

import java.io.*;

public class P_14494 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str[] = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        long dp[][] = new long[n+1][m+1];
        for(int i = 1; i<=n; i++)
            dp[i][1] = 1;
        for(int i = 1; i<=m; i++)
            dp[1][i] = 1;
        for(int i = 2; i<=n; i++){
            for(int j = 2; j<=m; j++){
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]+dp[i-1][j-1])%1000000007;
            }
        }
        bw.write(dp[n][m]+"");
        bw.flush();
    }

}
