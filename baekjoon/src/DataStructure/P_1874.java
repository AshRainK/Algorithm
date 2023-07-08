import java.io.*;
import java.util.Stack;

public class P_1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int count = 1;
        for(int i =0; i<N; i++){
            int temp = Integer.parseInt(br.readLine());
             while(count<temp){
                stack.push(count++);
                sb.append("+\n");
             }
             if(count == temp){
                 sb.append("+\n");
                 sb.append("-\n");
                 count++;
             }
             else if(count>temp){
                 if(temp == stack.peek()){
                     stack.pop();
                     sb.append("-\n");
                 }
                 else{
                     sb = new StringBuilder();
                     sb.append("NO\n");
                     break;
                 }
             }
        }
        bw.write(sb.toString());
        bw.flush();
    }

}
