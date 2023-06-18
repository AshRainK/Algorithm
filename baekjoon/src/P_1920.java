import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class P_1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int num[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<M; i++){
            int key = Integer.parseInt(st.nextToken());
            int idx = Arrays.binarySearch(num,key);
            if(idx>=0)
                bw.write("1");
            else
                bw.write("0");
            if(i<M-1)
                bw.write("\n");
        }
        bw.flush();
    }

}
