import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class P_11286 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comp());
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            int x = Integer.parseInt(br.readLine());
            if (Math.abs(x) > 0)
                pq.add(x);
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


    public static class Comp implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            if(Math.abs(o1)>Math.abs(o2))
                return 1;
            else if (Math.abs(o1) == Math.abs(o2)){
                if(o1> o2)
                    return 1;
                else if(o1 == o2)
                    return 0;
                else
                    return -1;
            }
            else
                return -1;
        }
    }
}
