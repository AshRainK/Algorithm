package DynamicProgramming;

import java.io.*;

public class P_11057 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int dp[][] = new int[N+1][10];
        int result = 0;
        for(int i = 0; i<10; i++){
            dp[1][i] = 1;
        }
        for(int i = 2; i<=N; i++){
            for(int j = 0; j<10; j++){
                int sum = 0;
                for(int k = j; k<10; k++){
                    sum = (sum+dp[i-1][k])%10007;
                }
                dp[i][j] = sum;
            }
        }
        for(int i = 0; i<10; i++){
            result=(result+dp[N][i])%10007;
        }

        bw.write(result+"");
        bw.flush();
    }

}
