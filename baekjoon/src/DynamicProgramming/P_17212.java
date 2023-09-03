package DynamicProgramming;

import java.io.*;


public class P_17212 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+1];
        dp[0] = 0;
        for(int i = 1; i<=N; i++){
            dp[i] = Integer.MAX_VALUE;
            if(i - 1 >= 0)
                dp[i] = Math.min(dp[i],dp[i-1]+1);
            if(i - 2 >= 0)
                dp[i] = Math.min(dp[i],dp[i-2]+1);
            if(i - 5 >= 0)
                dp[i] = Math.min(dp[i],dp[i-5]+1);
            if(i - 7 >= 0)
                dp[i] = Math.min(dp[i],dp[i-7]+1);
        }
        bw.write(dp[N]+"");
        bw.flush();
    }
}
