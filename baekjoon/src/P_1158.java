import java.io.*;
import java.util.*;

public class P_1158 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> arr = new ArrayList<>();
        int count = 1;
        for(int i =0; i<N; i++)
            queue.add(i+1);
        while(!queue.isEmpty()){
            if(count/K == 1){
                arr.add(queue.poll());
                count = 1;
            } else{
                int temp = queue.poll();
                queue.add(temp);
                count++;
            }
        }
        String result = arr.toString().replace("[","<");
        result = result.replace("]",">");
        bw.write(result);
        bw.flush();
    }

}
