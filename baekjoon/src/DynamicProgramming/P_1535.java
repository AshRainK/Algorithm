package DynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class P_1535 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int damage[] =  new int[N+1];
        for(int i = 1; i<=N; i++)
            damage[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        int happy[] =  new int[N+1];
        for(int i = 1; i<=N; i++)
            happy[i] = Integer.parseInt(st.nextToken());
        int dp[] = new int[100];
        for(int i = 1; i<=N; i++){
            for(int j = 99; j>= damage[i]; j--)
                dp[j] = Math.max(dp[j-damage[i]]+happy[i],dp[j]);
        }
        bw.write(dp[99]+"");
        bw.flush();
    }

}
