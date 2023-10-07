package DynamicProgramming;

import java.io.*;
import java.util.Stack;

public class P_12852 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        long dp[] = new long[n+1];
        int idx[] = new int[n+1];
        dp[1] = 0;
        for(int i = 2; i<=n; i++){
            dp[i] = dp[i-1] + 1;
            idx[i] = i-1;
            if(i%2 == 0){
                if(dp[i/2]+1 < dp[i]){
                    dp[i] = dp[i/2] + 1;
                    idx[i] = i/2;
                }
            }
            if(i%3 == 0){
                if(dp[i/3]+1 < dp[i]){
                    dp[i] = dp[i/3] + 1;
                    idx[i] = i/3;
                }
            }
        }
        bw.write(dp[n]+"\n");
        while(n>0){
            bw.write(n+" ");
            n = idx[n];
        }
        bw.flush();
    }

}
