package Greedy;
import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;
import java.util.Deque;

public class P_13417 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine()," ");
            Deque<Character> deq = new ArrayDeque<>();
            for(int j = 0; j<N; j++){
                char c = st.nextToken().charAt(0);
                if(deq.isEmpty()){
                    deq.addFirst(c);
                }
                else{
                    char top = deq.peekFirst();
                    if(top>=c)
                        deq.addFirst(c);
                    else
                        deq.addLast(c);
                }
            }
            for(char c : deq){
                bw.write(c+"");
            }
            bw.write("\n");
        }
        bw.flush();
    }

}
