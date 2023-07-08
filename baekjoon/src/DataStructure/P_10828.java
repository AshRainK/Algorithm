import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class P_10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i =0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                stack.add(num);
            }
            else if(str.equals("top")){
                if(!stack.empty())
                    bw.write(stack.peek()+"");
                else
                    bw.write("-1");
                if(i < n-1)
                    bw.write("\n");
            }
            else if(str.equals("size")){
                bw.write(stack.size()+"");
                if(i < n-1)
                    bw.write("\n");
            }
            else if(str.equals("empty")){
                if(stack.empty())
                    bw.write("1");
                else
                    bw.write("0");
                if(i < n-1)
                    bw.write("\n");
            }
            else if(str.equals("pop")){
                if(!stack.empty()){
                    bw.write(stack.pop()+"");
                }
                else{
                    bw.write("-1");
                }
                if(i < n-1)
                    bw.write("\n");
            }
        }
        bw.flush();
    }

}
