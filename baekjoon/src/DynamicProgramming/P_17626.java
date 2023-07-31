package DynamicProgramming;

import java.io.*;

public class P_17626 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[n+2];
        dp[0] = 0;
        dp[1] = 1;
        for(int i =2; i<=n; i++){
            dp[i] = 4;
            for(int j = 1; j*j<=i; j++){
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        bw.write(dp[n]+"");
        bw.flush();
    }

}
