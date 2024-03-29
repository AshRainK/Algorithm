package DynamicProgramming;

import java.io.*;

public class P_10844 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long dp[][] = new long[N+1][10];
        dp[0] = new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        dp[1] = new long[]{0,1,1,1,1,1,1,1,1,1};
        for(int i = 2; i<=N; i++){
           for(int j = 0; j<10; j++){
               if(j == 0)
                   dp[i][0] = (dp[i-1][1])%1000000000;
               else if(j == 9)
                   dp[i][9] = (dp[i-1][8])%1000000000;
               else
                   dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
           }
        }
        long result = 0;
        for(int i = 0; i<dp[N].length; i++){
            result = (result + dp[N][i])%1000000000;
        }
        bw.write(result+"");
        bw.flush();
    }

}
