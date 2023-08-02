package DynamicProgramming;

import java.io.*;
import java.util.Arrays;

public class P_11722 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        int arr[] = new int[N+1];
        int dp[] = new int[N+1];
        for(int i = 1; i<=N; i++)
            arr[i] = Integer.parseInt(str[i-1]);
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i<=N; i++){
            dp[i] = 1;
            for(int j = 1; j<=i; j++){
                if(arr[i]<arr[j])
                    dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }
        Arrays.sort(dp);
        bw.write(dp[N]+"");
        bw.flush();
    }

}

