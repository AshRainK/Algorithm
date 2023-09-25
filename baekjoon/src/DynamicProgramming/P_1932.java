package DynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class P_1932 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int arr[][] = new int[n+1][];
        int dp[][] = new int[n+1][];
        int idx;
        for(int i = 1; i<=n; i++){
            arr[i] = new int[i+1];
            dp[i] = new int[i+1];
        }
        for(int i = 1; i<=n; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 1; j<=i; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[1][1] = arr[1][1];
        for(int i = 2; i<=n; i++){
            for(int j = 1; j<arr[i].length; j++){
                if(j == 1)
                    dp[i][j] = dp[i-1][j]+arr[i][j];
                else if(j == arr[i].length-1)
                    dp[i][j] = dp[i-1][j-1]+arr[i][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j-1]+arr[i][j],dp[i-1][j]+arr[i][j]);
            }
        }
        int max = 0;
        for(int i = 1; i<dp[n].length; i++)
            max = Math.max(max,dp[n][i]);
        bw.write(max+"");
        bw.flush();
    }

}
