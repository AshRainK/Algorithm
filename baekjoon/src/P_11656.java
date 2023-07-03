import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class P_11656 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        String[] arr = new String[len];
        for(int i=0; i<len; i++){
            arr[i] = str.substring(i);
        }
        Arrays.sort(arr);
        for(int i =0; i<len; i++){
            sb.append(arr[i]+"\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }

}
