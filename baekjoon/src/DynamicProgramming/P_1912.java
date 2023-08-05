package DynamicProgramming;

import java.io.*;

public class P_1912 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int max;
        String str[] = br.readLine().split(" ");
        int arr[] = new int[N+1];
        for(int i = 1; i<=N; i++)
            arr[i] = Integer.parseInt(str[i-1]);
        int dp[] = new int[N+1];
        dp[1] = arr[1];
        for(int i = 2; i<=N; i++){
            dp[i] = Math.max(arr[i],dp[i-1]+arr[i]);
        }
        max = dp[1];
        for(int i = 2; i<=N; i++)
            max = Math.max(max,dp[i]);
        bw.write(max+"");
        bw.flush();
    }

}
