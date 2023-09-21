package DynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class P_19947 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        long dp[] = new long[Y+1];
        dp[0] = H;
        for(int i = 1; i<=Y; i++){
            dp[i] = (long)Math.floor(dp[i-1] * 1.05);
            if(i >= 3)
                dp[i] = Math.max((long)Math.floor(dp[i-3] * 1.2), dp[i]);
            if(i >= 5)
                dp[i] = Math.max((long)Math.floor(dp[i-5] * 1.35), dp[i]);
        }
        bw.write(dp[Y]+"");
        bw.flush();
    }

}
