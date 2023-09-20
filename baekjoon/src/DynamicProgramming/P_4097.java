package DynamicProgramming;

import java.io.*;
import java.util.Arrays;

public class P_4097 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0)
                break;
            int dp[] = new int[n+1];
            int arr[] = new int[n+1];
            for(int i = 1; i<=n; i++)
                arr[i] = Integer.parseInt(br.readLine());
            dp[1] = arr[1];
            for(int i = 2; i<=n; i++){
                dp[i] = arr[i];
                dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
            }
            int max = Integer.MIN_VALUE;
            for(int i = 1; i<=n; i++)
                max = Math.max(max,dp[i]);
            bw.write(max+"\n");
        }
        bw.flush();
    }

}
