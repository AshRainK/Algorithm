import java.io.*;
import java.util.Stack;

public class P_10799 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = 0;
        char prev = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char temp = str.charAt(i);
            if(temp == ')'){
                stack.pop();
                if(!stack.empty() && prev == '('){ //막대가 있고, 레이저 이면
                    result += stack.size();
                }
                else if(prev == ')') {
                    result++;
                }
            }
            else if(temp == '(')
                stack.push(temp);
            prev = temp;
        }
        bw.write(result+"");
        bw.flush();
    }

}
