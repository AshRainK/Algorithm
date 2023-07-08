package DynamicProgramming;

import java.io.*;

public class P_24416 {

    static int recursiveCount = 0;
    static int dynamicCount = 0;
    static int dp[] = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        re_fib(N); dp_fib(N);
        sb.append(recursiveCount);
        sb.append(" ");
        sb.append(dynamicCount);
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    public static int re_fib(int n){
        if(n == 1 || n == 2){
            recursiveCount++;
            return 1;
        }
        else
            return re_fib(n-1) + re_fib(n-2);
    }

    public static int dp_fib(int n){
        dp[1] = dp[2] = 1;
        for(int i =3; i<=n; i++){
            dynamicCount++;
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }



}
