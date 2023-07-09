package DynamicProgramming;

import java.io.*;
import java.math.BigInteger;

public class P_10826 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        BigInteger dp[] = new BigInteger[n+3]; // BigInteger 사용법
        dp[0] = BigInteger.valueOf(0);
        dp[1] = dp[2] = BigInteger.valueOf(1);
        for(int i = 3; i<=n; i++){
            dp[i] = dp[i-1].add(dp[i-2]);
        }
        bw.write(dp[n]+"");
        bw.flush();
    }

}
