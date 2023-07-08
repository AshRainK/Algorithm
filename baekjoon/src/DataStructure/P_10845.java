import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P_10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Queue<Integer> queue = new LinkedList<>();
        int last = -1;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String func = st.nextToken();
            if(func.equals("push")){
                int temp = Integer.parseInt(st.nextToken());
                queue.add(temp);
                last = temp;
            }
            else if(func.equals("pop")){
                if(queue.isEmpty())
                    bw.write("-1");
                else
                    bw.write(queue.poll()+"");
                if(i<N-1)
                    bw.write("\n");
            }
            else if(func.equals("size")){
                bw.write(queue.size()+"");
                if(i<N-1)
                    bw.write("\n");
            }
            else if(func.equals("empty")){
                if(queue.isEmpty())
                    bw.write("1");
                else
                    bw.write("0");
                if(i<N-1)
                    bw.write("\n");
            }
            else if(func.equals("front")){
                if(queue.isEmpty())
                    bw.write("-1");
                else
                    bw.write(queue.peek()+"");
                if(i<N-1)
                    bw.write("\n");
            }
            else if(func.equals("back")){
                if(queue.isEmpty())
                    bw.write("-1");
                else
                    bw.write(last+"");
                if(i<N-1)
                    bw.write("\n");
            }
        }
        bw.flush();
    }

}
