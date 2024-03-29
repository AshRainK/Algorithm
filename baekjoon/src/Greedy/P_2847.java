package Greedy;

import java.io.*;

public class P_2847 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int arr[] = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = N-1; i>0; i--){
            while(arr[i] <= arr[i-1]){
                count++;
                arr[i-1]--;
            }
        }
        bw.write(count+"");
        bw.flush();
    }

}
