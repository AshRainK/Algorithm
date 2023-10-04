package DynamicProgramming;

import java.io.*;

public class P_15990 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        long dp[][] = new long[100001][4];
        for(int j = 1; j<=100000; j++){
            if(j == 1){
                dp[j][1] = 1;
            }
            else if(j == 2){
                dp[j][2] = 1;
            }
            else if(j == 3){
                dp[j][1] = 1;
                dp[j][2] = 1;
                dp[j][3] = 1;
            }
            else{
                dp[j][1] = (dp[j-1][2]+dp[j-1][3])%1000000009;
                dp[j][2] = (dp[j-2][1]+dp[j-2][3])%1000000009;
                dp[j][3] = (dp[j-3][1]+dp[j-3][2])%1000000009;
            }
        }
        for(int i = 0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            long result = 0;
            for(int j = 1; j<=3; j++){
                result = (result+dp[n][j])%1000000009;
            }
            bw.write(result+"\n");
        }
        bw.flush();
    }

}
