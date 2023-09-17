package DynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class P_16395 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int dp[][] = new int[n+1][];
        for(int i = 1; i<=n; i++)
            dp[i] = new int[i+1];

        for(int i = 1; i<=n; i++){
            dp[i][1] = 1;
            dp[i][i] = 1;
            for(int j = 2; j<i; j++){
                dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
            }
        }
        bw.write(dp[n][k]+"");
        bw.flush();
    }

}
