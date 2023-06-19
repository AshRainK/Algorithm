import java.io.*;
import java.util.PriorityQueue;

public class P_1927 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        for(int i =0; i<N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x>0){
                pq.add(x);
            }
            else{
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
