package DynamicProgramming;

import java.io.*;

public class P_15988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        long dp[] = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i<=1000000; i++)
            dp[i] = (dp[i-1]+dp[i-2]+dp[i-3])%1000000009;
        for(int i = 0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            bw.write(dp[n]+"\n");
        }
        bw.flush();
    }

}
