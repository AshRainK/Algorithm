package Sorting;

import java.io.*;
import java.util.Arrays;

public class P_25305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");
        int arr[] = new int[N];
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        bw.write(arr[N-k]+"");
        bw.flush();
    }

}
