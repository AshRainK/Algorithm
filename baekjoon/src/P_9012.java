import java.io.*;
import java.util.Stack;

public class P_9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T; i++){
            Stack<Character> stack = new Stack<>();
            char[] temp = br.readLine().toCharArray();
            for(int j = 0; j<temp.length; j++){
                if(temp[j] == '(')
                    stack.push(temp[j]);
                else{
                    if(!stack.empty() && stack.peek() == '(')
                        stack.pop();
                    else
                        stack.push(temp[j]);
                }
            }
            if(stack.empty())
                bw.write("YES");
            else
                bw.write("NO");
            if(i<T-1)
                bw.write("\n");
        }
        bw.flush();
    }

}
