package DynamicProgramming;

import java.io.*;

public class P_9658 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+4];
        dp[1] = 2;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 1;
        for(int i=5; i<=N; i++){
            dp[i] = 2;
            if(dp[i-1] % 2 == 0 || dp[i-3] % 2 == 0 || dp[i-4]%2 == 0)
                dp[i] = 1;
        }
        if(dp[N] == 1)
            bw.write("SK");
        else
            bw.write("CY");
        bw.flush();
    }

}
