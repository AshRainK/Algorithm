package DynamicProgramming;

import java.io.*;
import java.util.Arrays;

public class P_2670 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        double arr[] = new double[N+1];
        double dp[] = new double[N+1];
        for(int i = 1; i<=N; i++)
            arr[i] = Double.parseDouble(br.readLine());
        dp[0] = 0;
        dp[1] = arr[1];
        for(int i = 2; i<=N; i++){
            dp[i] = Math.max(arr[i],dp[i-1]*arr[i]);
        }
        Arrays.sort(dp);
        String result = String.format("%.3f",dp[N]);
        bw.write(result);
        bw.flush();
    }

}
