package DynamicProgramming;

import java.io.*;
import java.util.Arrays;

public class P_1965 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        int arr[] = new int[n+1];
        int dp[] = new int[n+1];
        for(int i = 1; i<=n; i++)
            arr[i] = Integer.parseInt(str[i-1]);

        for(int i = 1; i<=n; i++){
            dp[i] = 1;
            for(int j = 1; j<i; j++){
                if(arr[j]<arr[i])
                    dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }
        Arrays.sort(dp);
        bw.write(dp[n]+"");
        bw.flush();
    }

}
