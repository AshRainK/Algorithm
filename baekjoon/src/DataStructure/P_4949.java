package DataStructure;

import java.io.*;
import java.util.Stack;

public class P_4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            String str = br.readLine();
            boolean flag = true;
            if(str.equals("."))
                break;
            Stack<Character> stack = new Stack<>();
            for(int i =0; i<str.length(); i++){
                char c = str.charAt(i);
                if(c == '(' || c == '[')
                    stack.push(c);
                if(c == ')'){
                    if(!stack.empty() && stack.peek() == '(')
                        stack.pop();
                    else{
                        flag = false;
                        break;
                    }
                }
                else if(c == ']'){
                    if(!stack.empty() && stack.peek() == '[')
                        stack.pop();
                    else{
                        flag = false;
                        break;
                    }
                }
            }
            if(flag && stack.empty())
                bw.write("yes\n");
            else
                bw.write("no\n");
        }
        bw.flush();
    }

}
