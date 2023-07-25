package DynamicProgramming;

import java.io.*;

public class P_2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int dp[][] = new int[k+1][n+2];
            for(int t = 1; t<=n; t++){
                dp[0][t] = t;
            }
            for(int j = 1; j<=k; j++){
                for(int t = 1; t<=n; t++)
                    for(int p = 1; p<=t; p++)
                        dp[j][t] += dp[j-1][p];
            }
            bw.write(dp[k][n]+"\n");
        }
        bw.flush();
    }

}
