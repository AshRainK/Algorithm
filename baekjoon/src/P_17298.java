import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class P_17298 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int result[] = new int[N];
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i =0; i<N; i++){
            while(!stack.empty() && arr[stack.peek()]<arr[i])
                result[stack.pop()] = arr[i];
            stack.push(i);
        }
        while(!stack.empty()){
            result[stack.pop()] = -1;
        }
        for(int i =0; i<N; i++){
            bw.write(result[i]+" ");
        }
        bw.flush();
    }

}
