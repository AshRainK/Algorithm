package DynamicProgramming;

import java.io.*;

public class P_14916 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[n+5];
        dp[0] = 0;
        dp[1] = -1;
        dp[2] = 1;
        dp[3] = -1;
        dp[4] = 2;
        dp[5] = 1;
        for(int i = 6; i <= n; i++){
            if(dp[i-5] == -1 && dp[i-2] == -1 )
                dp[i] = -1;
            else{
                dp[i] = Integer.MAX_VALUE;
                if(dp[i-5] != -1)
                    dp[i] = Integer.min(dp[i-5]+1,dp[i]);
                if(dp[i-2] != -1)
                    dp[i] = Integer.min(dp[i-2]+1,dp[i]);
            }
        }
        bw.write(dp[n]+"");
        bw.flush();
    }


}
