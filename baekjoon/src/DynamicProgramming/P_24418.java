package DynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class P_24418 {

    static int recCount=0;
    static int dpCount=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n+1][n+1];
        int dp[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= n; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }
        matrix_path(arr, n);
        for (int i = 0; i < n; i++)
            dp[i][0] = 0;
        for (int i = 1; i < n; i++)
            dp[0][i] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                dpCount++;
            }
        }
        bw.write(recCount + " " + dpCount);
        bw.flush();
    }

    public static void matrix_path(int arr[][], int n){
        matrix_path_rec(arr,n,n);
    }

    public static int matrix_path_rec(int arr[][], int i, int j){
        if(i == 0 || j == 0 ){
            recCount++;
            return 0;
        }
        else
            return arr[i][j] + Math.max(matrix_path_rec(arr,i-1,j),matrix_path_rec(arr,i,j-1));
    }




}
