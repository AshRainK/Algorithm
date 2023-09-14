package DynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class P_16194 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int price[] = new int[N+1];
        for(int i = 1; i<=N; i++)
            price[i] = Integer.parseInt(st.nextToken());
        int dp[] = new int[N+1];
        dp[0] = 0;
        dp[1] = price[1];
        for(int i = 2; i<=N; i++){
            dp[i] = price[i];
            for(int j = 1; j<i; j++){
                dp[i] = Math.min(dp[i],dp[i-j]+dp[j]);
            }
        }
        bw.write(dp[N]+"");
        bw.flush();
    }

}
