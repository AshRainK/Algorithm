package Greedy;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class P_1026 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        int b[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<n; i++)
            a[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<n; i++)
            b[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(a);
        Arrays.sort(b);
        int result = 0;
        for(int i = 0; i<n; i++){
            result += (a[i] * b[n-1-i]);
        }
        bw.write(result+"");
        bw.flush();
    }

}
