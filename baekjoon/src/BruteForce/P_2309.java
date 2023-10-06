package BruteForce;

import java.io.*;
import java.util.Arrays;

public class P_2309 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr[] = new int[9];
        int remain = 0;
        boolean flag = false;
        for(int i = 0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            remain += arr[i];
        }
        remain -= 100;
        for(int i = 0; i<9; i++){
            for(int j = i+1; j<9; j++){
                if(arr[i]+arr[j] == remain){
                    arr[i] = 0;
                    arr[j] = 0;
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
        }
        Arrays.sort(arr);
        for(int i = 2; i<9; i++)
            bw.write(arr[i]+"\n");
        bw.flush();
    }

}
