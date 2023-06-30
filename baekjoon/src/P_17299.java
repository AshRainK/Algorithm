import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class P_17299 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        Map<Integer,Integer> checker = new HashMap<>();
        int result[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Stack<Integer> stack = new Stack<>();
        for(int i =0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            if(checker.containsKey(temp)){
                int cnt = checker.get(temp);
                checker.replace(temp,cnt+1);
            }
            else
                checker.put(temp,1);
        }
        for(int i =0; i<N; i++){
            while(!stack.empty() && checker.get(arr[i])>checker.get(arr[stack.peek()])){
                int idx = stack.pop();
                result[idx] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.empty()){
            result[stack.pop()] = -1;
        }
        for(int i = 0; i<N; i++){
            bw.write(result[i]+" ");
        }
        bw.flush();
    }

}
