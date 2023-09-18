package DynamicProgramming;

import java.io.*;
import java.util.Arrays;

public class P_2693 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++){
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];
            for(int j = 0; j<arr.length; j++){
                arr[j] = Integer.parseInt(str[j]);
            }
            Arrays.sort(arr);
            bw.write(arr[arr.length-3]+"\n");
        }
        bw.flush();
    }

}
