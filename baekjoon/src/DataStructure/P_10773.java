import java.io.*;
import java.util.Stack;

public class P_10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        for(int i =0; i<K; i++){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                if(!stack.empty())
                    stack.pop();
            }
            else{
                stack.push(n);
            }
        }
        int sum = 0;
        while(!stack.empty())
            sum += stack.pop();
        bw.write(sum+"");
        bw.flush();
    }

}
