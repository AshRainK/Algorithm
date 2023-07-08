import java.io.*;
import java.util.Stack;

public class P_17413 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        boolean checker = true;
        for(int i =0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '<'){
                if(!stack.empty()){
                    while(!stack.empty())
                        sb.append(stack.pop());
                }
                checker = false;
                sb.append(c);
                continue;
            }
            else if(c == '>'){
                checker = true;
                sb.append(c);
                continue;
            }
            if(checker){
                if(c == ' '){
                    while(!stack.empty())
                        sb.append(stack.pop());
                    sb.append(c);
                }
                else{
                    stack.push(c);
                }
            }
            else
                sb.append(c);
        }
        if(!stack.empty()){
            while(!stack.empty())
                sb.append(stack.pop());
        }
        bw.write(sb.toString());
        bw.flush();
    }

}
