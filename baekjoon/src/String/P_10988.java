package String;

import java.io.*;
import java.util.Stack;

public class P_10988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String rev;
        boolean checker = true;
        Stack<Character> stack = new Stack<>();
        for(int i =0; i<str.length(); i++)
            stack.push(str.charAt(i));
        for(int i =0; i<str.length(); i++){
            if(stack.pop() != str.charAt(i))
                checker = false;
        }
        if(checker)
            bw.write("1");
        else
            bw.write("0");
        bw.flush();
    }

}
