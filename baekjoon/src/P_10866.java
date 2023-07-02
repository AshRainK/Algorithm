import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P_10866 {

    public static void main(String[] args) throws IOException {
        Deque<Integer> deq = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i =0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String func = st.nextToken();
            if(func.equals("push_front")){
                int temp = Integer.parseInt(st.nextToken());
                deq.addFirst(temp);
            }
            else if(func.equals("push_back")){
                int temp = Integer.parseInt(st.nextToken());
                deq.addLast(temp);
            }
            else if(func.equals("pop_front")){
                if(deq.isEmpty())
                    bw.write("-1");
                else
                    bw.write(deq.pollFirst()+"");
                if(i<N-1)
                    bw.write("\n");
            }
            else if(func.equals("pop_back")){
                if(deq.isEmpty())
                    bw.write("-1");
                else
                    bw.write(deq.pollLast()+"");
                if(i<N-1)
                    bw.write("\n");
            }
            else if(func.equals("size")){
                bw.write(deq.size()+"");
                if(i<N-1)
                    bw.write("\n");
            }
            else if(func.equals("empty")){
                if(deq.isEmpty())
                    bw.write("1");
                else
                    bw.write("0");
                if(i<N-1)
                    bw.write("\n");
            }
            else if(func.equals("front")){
                if(deq.isEmpty())
                    bw.write("-1");
                else
                    bw.write(deq.peekFirst()+"");
                if(i<N-1)
                    bw.write("\n");
            }
            else if(func.equals("back")){
                if(deq.isEmpty())
                    bw.write("-1");
                else
                    bw.write(deq.peekLast()+"");
                if(i<N-1)
                    bw.write("\n");
            }
        }
        bw.flush();
    }

}