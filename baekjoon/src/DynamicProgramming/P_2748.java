package DynamicProgramming;

import java.io.*;

public class P_2748 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long arr[] = new long[91]; //int형 사용시 OverFlow 발생
        arr[0] = 0;
        arr[1] = arr[2] = 1;
        for(int i =3; i<=N; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        bw.write(arr[N]+"");
        bw.flush();
    }




}
