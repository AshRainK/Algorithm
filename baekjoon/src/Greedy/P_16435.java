package Greedy;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class P_16435 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        int arr[] = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i = 0; i<N; i++){
            if(arr[i]<=len){
                len++;
            }
            else
                break;
        }
        bw.write(len+"");
        bw.flush();
    }

}
