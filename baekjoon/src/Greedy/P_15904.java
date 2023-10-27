package Greedy;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class P_15904 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Queue<Character> queue = new LinkedList<>();
        boolean first = false ,second = false,third = false, fourth = false;
        while(st.hasMoreTokens()){
            String temp = st.nextToken();
            int len = temp.length();
            for(int i = 0; i<len; i++) {
                char c = temp.charAt(i);
                if(c >='A' && c<='Z')
                    queue.add(c);
            }
        }
        while(!queue.isEmpty()){
            char c = queue.poll();
            if(c == 'U' && !first)
                first = true;
            if(c == 'C' && first)
                second = true;
            if(c == 'P' && first && second)
                third = true;
            if(c == 'C' && first && second && third)
                fourth = true;
        }
        if(first && second && third && fourth)
            bw.write("I love UCPC");
        else
            bw.write("I hate UCPC");
        bw.flush();
        br.close();
        bw.close();
    }

}
