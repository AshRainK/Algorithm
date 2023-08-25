package DynamicProgramming;

import java.io.*;

public class P_12015 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        int arr[] = new int[N+1];
        for(int i = 1; i<=N; i++)
            arr[i] = Integer.parseInt(str[i-1]);
        int dp[] = new int[N+1];
        dp[1] = arr[1];
        int len = 1;
        for(int i = 2; i<=N; i++){
            if(arr[i]>dp[len]){
                dp[++len] = arr[i];
            }
            else{
                int key = arr[i];
                int idx = b_search(dp,1,len+1,arr[i]);
                dp[idx] = arr[i];
            }
        }
        bw.write(len+"\n");
        bw.flush();
    }

    public static int b_search(int arr[], int start, int end, int key){
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid]<key)
                start = mid +1;
            else
                end = mid;
        }
        return start;
    }


}
