package DynamicProgramming;

import java.io.*;

public class P_9461 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());
        for(int i =0; i<N; i++){
            int K = Integer.parseInt(br.readLine());
            long dp[] = new long[K+10];
            dp[1] = dp[2] = dp[3] = 1;
            dp[4] = dp[5] = 2;
            for(int j = 6; j<=K; j++){
                dp[j] = dp[j-1] + dp[j-5];
            }
            bw.write(dp[K]+"\n");
        }
        bw.flush();
    }

}
