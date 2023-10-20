package BackTracking;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class P_15656 {

    static int N,M;
    static int nums[];
    static int record[];
    static StringBuilder sb;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();
        nums = new int[N];
        record = new int[M];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<N; i++)
            nums[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(nums);
        for(int i = 0; i<N; i++){
            dfs(i,0);
        }
        bw.write(sb.toString());
        bw.flush();
    }

    static void dfs(int idx, int count){
        record[count] = nums[idx];
        if(count + 1 == M){
            for(int num : record)
                sb.append(num+" ");
            sb.append("\n");
            return;
        }
        for(int i = 0; i<N; i++)
            dfs(i,count+1);
    }
}
