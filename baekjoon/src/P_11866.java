import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P_11866 {

    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int n,k;
        n = Integer.parseInt(stringTokenizer.nextToken());
        k = Integer.parseInt(stringTokenizer.nextToken());
        for(int i=0; i<n; i++)
            queue.add(i+1);
        int count = 1;
        while(true){
            if(queue.isEmpty())
                break;
            if(count == k || queue.size() == 1){
                int num = queue.peek();
                queue.remove();
                result.add(num);
                count = 1;
                continue;
            }
            int num = queue.peek();
            queue.remove();
            queue.add(num);
            count++;
        }
        String resultString =  result.toString();
        resultString = resultString.replace('[','<');
        resultString = resultString.replace(']','>');
        bw.write(resultString);
        bw.flush();
    }
}
