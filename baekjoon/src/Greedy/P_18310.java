package Greedy;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class P_18310 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int arr[] = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int idx = 0;
        if(N%2 == 0){
            idx = N/2-1;
        }
        else {
            idx = N/2;
        }
        bw.write(arr[idx]+"");
        bw.flush();
    }

}
