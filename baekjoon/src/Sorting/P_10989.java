package Sorting;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class P_10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[10001][1];
        for(int i = 1; i<=N; i++){
            int idx = Integer.parseInt(br.readLine());
            arr[idx][0]++;
        }
        for(int i = 1; i<arr.length; i++){
            int count = arr[i][0];
            for(int j=0; j<count; j++)
                bw.write(i+"\n");
        }
        bw.flush();
    }

}
