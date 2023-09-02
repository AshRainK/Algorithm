package DynamicProgramming;

import java.io.*;
import java.math.BigInteger;

public class P_9711 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger dp[] = new BigInteger[10001];
        StringBuilder sb = new StringBuilder();
        dp[1] = BigInteger.ONE;
        dp[2] = BigInteger.ONE;
        for(int i = 3; i<=10000; i++)
            dp[i] = dp[i-1].add(dp[i-2]);
        int T = Integer.parseInt(br.readLine());
        String str[];
        for(int i = 0; i<T; i++){
            str = br.readLine().split(" ");
            int P = Integer.parseInt(str[0]);
            int Q = Integer.parseInt(str[1]);
            sb.append("Case #"+(i+1)+": "+dp[P].remainder(BigInteger.valueOf(Q))+"\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }

}
