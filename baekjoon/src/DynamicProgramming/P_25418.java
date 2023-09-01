package DynamicProgramming;
import java.io.*;

public class P_25418 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str[] = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int dp[] = new int[K+1];
        dp[A] = 0;
        for(int i = A+1; i<=K; i++){
            dp[i] = dp[i-1]+1;
            if(i % 2 == 0 && i / 2 >= A)
                dp[i] = Math.min(dp[i/2]+1,dp[i]);
        }
        bw.write(dp[K]+"");
        bw.flush();
    }

}
