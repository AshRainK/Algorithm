import java.io.*;
import java.util.Stack;

public class P_1935 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Stack<Double> stack = new Stack<>();
        int len = str.length();
        int num[] = new int[N];
        for(int i = 0; i<N; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        for(int i =0; i<len; i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <='Z'){
                stack.push(Double.valueOf(num[c-'A']));
            }
            else if(c == '+'){
                double b = stack.pop();
                double a = stack.pop();
                stack.push(a+b);
            }
            else if(c == '-'){
                double b = stack.pop();
                double a = stack.pop();
                stack.push(a-b);
            }
            else if(c == '*'){
                double b = stack.pop();
                double a = stack.pop();
                stack.push(a*b);
            }
            else if(c == '/'){
                double b = stack.pop();
                double a = stack.pop();
                stack.push(a/b);
            }
        }
        String result = String.format("%.2f",stack.pop());
        bw.write(result);
        bw.flush();
    }

}
