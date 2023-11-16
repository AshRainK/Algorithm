package Greedy;

import java.io.*;
import java.util.Arrays;

public class P_2012 {


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        long result = 0;
        for(int i = 0; i<N; i++){
            result += Math.abs(i+1-arr[i]);
        }
        bw.write(result+"\n");
        bw.flush();
    }

}
