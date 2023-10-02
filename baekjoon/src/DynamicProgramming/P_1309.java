package DynamicProgramming;

import java.io.*;

public class P_1309 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int dp[][] = new int[N+1][3];
        dp[1][0] = dp[1][1] = dp[1][2] = 1;
        for(int i = 2; i<=N; i++){
            dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2])%9901;
            dp[i][1] = (dp[i-1][0] + dp[i-1][2])%9901;
            dp[i][2] = (dp[i-1][0] + dp[i-1][1])%9901;
        }
        int result = 0;
        for(int i = 0; i<3; i++)
            result+=dp[N][i];
        bw.write((result%9901)+"");
        bw.flush();
    }

}
