package DynamicProgramming;
import java.io.*;

public class P_15989 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long dp[][] = new long[10001][4];
        dp[1][1] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;
        for(int i = 4; i<=10000; i++){
            dp[i][1] = dp[i-1][1];
            dp[i][2] = dp[i-2][1]+dp[i-2][2];
            dp[i][3] = dp[i-3][1]+dp[i-3][2]+dp[i-3][3];
        }
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            for(int j=1; j<=3; j++)
                result+=dp[n][j];
            bw.write(result+"\n");
        }
        bw.flush();
    }

}
