import java.io.*;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class P_1406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());
        for(int i = 0; i< str.length(); i++){
            left.push(str.charAt(i));
        }

        for(int i =0; i<M; i++){
            String command = br.readLine();
            if(command.charAt(0) == 'L'){
                if(left.empty())
                    continue;
                right.push(left.pop());
            }
            else if(command.charAt(0) == 'D') {
                if(right.empty())
                    continue;
                left.push(right.pop());
            }
            else if(command.charAt(0) == 'B'){
                if(left.empty())
                    continue;
                left.pop();
            }
            else if(command.charAt(0) == 'P'){
                left.push(command.charAt(2));
            }
        }
        while(!left.empty())
            right.push(left.pop());
        while(!right.empty())
            bw.write(right.pop()+"");
        bw.flush();
    }

}
