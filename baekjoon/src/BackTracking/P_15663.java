package BackTracking;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class P_15663 {

    static int N,M;
    static int nums[];
    static int records[];
    static boolean visited[];
    static StringBuilder sb;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N];
        records = new int[M];
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<N; i++)
            nums[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(nums);
        visited = new boolean[N];
        int before = 0;
        for(int i = 0; i<N; i++){
            if(before == nums[i])
                continue;
            dfs(i,0);
            before = nums[i];
        }
        bw.write(sb.toString());
        bw.flush();
    }

    public static void dfs(int idx, int count){
        records[count] = nums[idx];
        if(count + 1 == M){
            for(int num : records){
                sb.append(num+" ");
            }
            sb.append("\n");
            return;
        }
        visited[idx] = true;
        int before = 0;
        for(int i = 0; i<N; i++){
            if(before == nums[i] || visited[i])
                continue;
            dfs(i,count+1);
            before = nums[i];
        }
        visited[idx] = false;
    }

}
