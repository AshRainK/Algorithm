package DynamicProgramming;
import java.io.*;
import java.util.StringTokenizer;

public class P_9465 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            int arr[][] = new int[2][n+1];
            int dp[][] = new int[3][n+1];
            for(int j = 0; j<2; j++){
                st = new StringTokenizer(br.readLine()," ");
                for(int k = 1; k<=n; k++)
                    arr[j][k] = Integer.parseInt(st.nextToken());
            }
            dp[0][1] = 0;
            dp[1][1] = arr[0][1];
            dp[2][1] = arr[1][1];
            for(int j = 2; j<=n; j++){
                dp[0][j] = Math.max(dp[1][j-1],Math.max(dp[2][j-1],dp[0][j-1]));
                dp[1][j] = Math.max(dp[2][j-1] + arr[0][j],dp[0][j-1] + arr[0][j]);
                dp[2][j] = Math.max(dp[1][j-1] + arr[1][j],dp[0][j-1]+arr[1][j]);
            }
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<3; j++)
                max = Math.max(max,dp[j][n]);
            bw.write(max+"\n");
        }
        bw.flush();
    }

}
