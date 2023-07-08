import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class P_11576 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int toDec = 0;
        for(int i =1; i<=m; i++){
            int temp = Integer.parseInt(st.nextToken());
           toDec += temp * Math.pow(A,m-i);
        }
        while(toDec != 0){
            int remain = toDec % B;
            stack.push(toDec % B);
            toDec /= B;
        }
        while(!stack.empty())
            bw.write(stack.pop()+" ");
        bw.flush();
    }

}
