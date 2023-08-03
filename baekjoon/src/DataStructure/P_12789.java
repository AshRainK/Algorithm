package DataStructure;

import java.io.*;
import java.util.Stack;

public class P_12789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int line[] = new int[N];
        String str[] = br.readLine().split(" ");
        for(int i = 0; i<N; i++)
            line[i] = Integer.parseInt(str[i]);
        int order = 1;

        for(int i =0; i<N; i++){
            stack.push(line[i]);
            while(!stack.empty() && stack.peek() == order){
                stack.pop();
                order++;
            }
        }
        while(!stack.empty() && stack.peek() == order){
            stack.pop();
            order++;
        }
        if(stack.empty())
            bw.write("Nice");
        else
            bw.write("Sad");
        bw.flush();
    }

}
