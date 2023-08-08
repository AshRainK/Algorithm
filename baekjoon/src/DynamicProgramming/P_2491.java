package DynamicProgramming;

import java.io.*;

public class P_2491 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N+1];
        int dp1[] = new int[N+1];
        int dp2[] = new int[N+1];
        int max = 0;
        String str[] = br.readLine().split(" ");
        for(int i = 1; i<=N; i++){
            arr[i] = Integer.parseInt(str[i-1]);
        }
        for(int i =1; i<=N; i++){
            dp1[i] = 1;
            if(arr[i]>=arr[i-1])
                dp1[i] = Math.max(dp1[i],dp1[i-1]+1);
            max = Math.max(max,dp1[i]);
        }
        for(int i =1; i<=N; i++){
            dp2[i] = 1;
            if(arr[i]<=arr[i-1])
                dp2[i] = Math.max(dp2[i],dp2[i-1]+1);
            max = Math.max(max,dp2[i]);
        }
        bw.write(max+"");
        bw.flush();
    }

}
