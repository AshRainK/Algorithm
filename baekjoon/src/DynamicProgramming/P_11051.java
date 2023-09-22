package DynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class P_11051 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int dp[][] = new int[N+1][];
        for(int i = 1; i<=N; i++){
            dp[i] = new int[i+1];
            dp[i][0] = 1;
        }
        dp[1][1] = 1;
        for(int i = 2; i<=N; i++){
            if(i == 2){
                dp[i][1] = 2;
                dp[i][2] = 1;
            }
            else{
                for(int j = 1; j<=i; j++){
                    if(i == j)
                        dp[i][j] = 1;
                    else
                        dp[i][j] = (dp[i-1][j-1] + dp[i-1][j])%10007;
                }
            }
        }
        bw.write(dp[N][K]+"");
        bw.flush();
    }

}
