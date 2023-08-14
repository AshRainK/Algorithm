package DynamicProgramming;

import java.io.*;

public class P_17175 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+3];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i<=N; i++){
            dp[i] = (1+dp[i-1]+dp[i-2])%1000000007;
        }
        bw.write(dp[N]+"");
        bw.flush();
    }

}
