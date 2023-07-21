package DynamicProgramming;

import java.io.*;

public class P_1003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            int dp0[] = new int[N+4];
            int dp1[] = new int[N+4];
            dp0[0] = 1;
            dp1[0] = 0;
            dp0[1] = 0;
            dp1[1] = 1;
            dp0[2] = 1;
            dp1[2] = 1;
            for(int j = 3; j<=N; j++){
                dp0[j] = dp0[j-1] + dp0[j-2];
                dp1[j] = dp1[j-1] + dp1[j-2];
            }
            bw.write(dp0[N]+" "+dp1[N]+"\n");
        }
        bw.flush();
    }

}
