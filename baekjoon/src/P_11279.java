import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class P_11279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<N; i++){
            int x = Integer.parseInt(br.readLine());
            if( x > 0)
                pq.add(x);
            if(x == 0){
                if(pq.isEmpty())
                    bw.write("0");
                else
                    bw.write(pq.poll()+"");
                if(i<N-1)
                    bw.write("\n");
            }
        }
        bw.flush();
    }

}
