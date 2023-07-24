package DynamicProgramming;

import java.io.*;

public class P_9655 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+3];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        for(int i = 4; i<= N; i++){
            dp[i] = Math.min(dp[i-1]+1,dp[i-3]+1);
        }
        StringBuilder sb = new StringBuilder();
        if(dp[N] % 2 == 0){
            sb.append("CY");
        }
        else
            sb.append("SK");
        bw.write(sb.toString());
        bw.flush();
    }

}
