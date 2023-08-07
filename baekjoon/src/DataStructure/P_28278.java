package DataStructure;

import java.io.*;
import java.util.Stack;

public class P_28278 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<N; i++){
            String str[] = br.readLine().split(" ");
            if(str[0].equals("1")){
                stack.push(Integer.parseInt(str[1]));
            }
            else if(str[0].equals("2")){
                if(stack.empty())
                    bw.write("-1\n");
                else
                    bw.write(stack.pop()+"\n");
            }
            else if(str[0].equals("3")){
                bw.write(stack.size()+"\n");
            }
            else if(str[0].equals("4")){
                if(stack.empty())
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }
            else if(str[0].equals("5")){
                if(stack.empty())
                    bw.write("-1\n");
                else
                    bw.write(stack.peek()+"\n");
            }
        }
        bw.flush();
    }

}
