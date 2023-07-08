import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P_3273 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        HashSet<Integer> numbers = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            numbers.add(arr[i]);
        }
        int x = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i =0; i<n; i++){
            int dis = x-arr[i];
            if(numbers.contains(dis))
                result++;
        }
        bw.write(result/2+"");
        bw.flush();
    }

}
