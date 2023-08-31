package DynamicProgramming;

import java.io.*;

public class P_14501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N+1][2];
        int dp[] = new int[N+1];
        String str[];
        for(int i = 1; i<=N; i++){
            str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }
        for(int i = 1; i<=N; i++){
            if(i+arr[i][0]<=N+1)
                dp[i] = arr[i][1];
            else
                continue;
            for(int j = 1; j<i; j++){
                if(j+arr[j][0]<=i)
                    dp[i] = Math.max(dp[i],dp[j]+arr[i][1]);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 1; i<=N; i++)
            max = Math.max(max,dp[i]);
        bw.write(max+"");
        bw.flush();
    }

}