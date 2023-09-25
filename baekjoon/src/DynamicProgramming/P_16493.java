package DynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class P_16493 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int day[] = new int[M+1];
        int chapter[] = new int[M+1];
        int dp[] = new int[N+1];
        for(int i = 1; i<=M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            day[i] = Integer.parseInt(st.nextToken());
            chapter[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i<=M; i++){
            for(int j = N; j>=day[i]; j--){
                dp[j] = Math.max(dp[j],dp[j-day[i]]+chapter[i]);
            }
        }
        bw.write(dp[N]+"");
        bw.flush();
    }

}
