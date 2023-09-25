package DataStructure;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class P_2161 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=N; i++){
            queue.add(i);
        }
        while(!queue.isEmpty()){
            sb.append(queue.poll()+" ");
            if(!queue.isEmpty()){
                int temp = queue.poll();
                queue.add(temp);
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }

}
