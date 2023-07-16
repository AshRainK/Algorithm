package DataStructure;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class P_18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N; i++){
            String str[] = br.readLine().split(" ");
            if(str[0].equals("push")){
                queue.add(Integer.parseInt(str[1]));
            }
            else if(str[0].equals("pop")){
                if(queue.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(queue.poll()+"\n");
            }
            else if(str[0].equals("size")){
                sb.append(queue.size()+"\n");
            }
            else if(str[0].equals("empty")){
                if(queue.isEmpty())
                    sb.append("1\n");
                else
                    sb.append("0\n");
            }
            else if(str[0].equals("front")){
                if(queue.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(queue.peek()+"\n");
            }
            else if(str[0].equals("back")){
                if(queue.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(queue.getLast()+"\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }

}
