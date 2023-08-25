package BinarySearch;

import java.io.*;
import java.util.Arrays;

public class P_2776 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++){
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            int memo1[] = new int[N];
            String str[] = br.readLine().split(" ");
            for(int j = 0; j<N; j++)
                memo1[j] = Integer.parseInt(str[j]);
            int M = Integer.parseInt(br.readLine());
            int memo2[] = new int[M];
            str = br.readLine().split(" ");
            for(int j = 0; j<M; j++)
                memo2[j] = Integer.parseInt(str[j]);
            Arrays.sort(memo1);
            for(int j = 0; j<M; j++){
                int key = memo2[j];
                int idx = Arrays.binarySearch(memo1,key);
                if(idx >= 0)
                    sb.append("1\n");
                else
                    sb.append("0\n");
            }
            bw.write(sb.toString());
        }
        bw.flush();
    }

}
