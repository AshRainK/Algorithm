import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class P_9093 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            while(st.hasMoreTokens()){
                String temp = st.nextToken();
                for(int j=0; j<temp.length(); j++)
                    stack.push(temp.charAt(j));
                while(!stack.empty())
                    bw.write(stack.pop()+"");
                if(st.hasMoreTokens())
                    bw.write(" ");
            }
            if(i<T-1)
                bw.write("\n");
        }
        bw.flush();
    }

}
