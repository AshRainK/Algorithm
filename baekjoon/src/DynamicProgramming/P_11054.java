package DynamicProgramming;

import java.io.*;
import java.util.Arrays;

public class P_11054 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int arr[] = new int[N+1];
        int dpInc[] = new int[N+1];
        int dpDec[] = new int[N+1];
        for(int i = 1; i<=N; i++)
            arr[i] = Integer.parseInt(str[i-1]);
        for(int i = 1; i<=N; i++){
            dpInc[i] = 1;
            for(int j=1; j<i; j++){
                if(arr[j]<arr[i])
                    dpInc[i] = Math.max(dpInc[i],dpInc[j]+1);
            }
        }
        for(int i = N; i>=1; i--){
            dpDec[i] = 1;
            for(int j = N; j>i; j--){
                if(arr[j]<arr[i])
                    dpDec[i] = Math.max(dpDec[i], dpDec[j]+1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 1; i<=N; i++)
            max = Math.max(max,dpInc[i]+dpDec[i]-1);
        bw.write(max+"");
        bw.flush();
    }


}
