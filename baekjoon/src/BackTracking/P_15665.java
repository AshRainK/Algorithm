package BackTracking;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class P_15665 {

    private static int N,M;
    private static int[] nums, record;
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N];
        record = new int[M];
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        dfs(0);
        bw.write(sb.toString());
        bw.flush();
    }

    private static void dfs(int count){
        if(count == M){
            for(int num : record)
                sb.append(num).append(" ");
            sb.append("\n");
            return;
        }
        int before = 0;
        for(int i = 0; i<N; i++){
            if(before == nums[i])
                continue;
            record[count] = nums[i];
            dfs(count+1);
            before = nums[i];
        }
    }

}
