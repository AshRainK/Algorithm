import java.io.*;
import java.util.*;

public class P_18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int numbers[] = new int[n];
        int count = 0;
        Map<Integer,Integer> index = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i =0; i<numbers.length; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int sorted[] = numbers.clone();
        Arrays.sort(sorted);
        index.put(sorted[0],count++);
        for(int i =1; i<sorted.length; i++){
            if(sorted[i-1] == sorted[i])
                continue;
            index.put(sorted[i],count++);
        }
       for(int i = 0; i<numbers.length; i++){
            bw.write(index.get(numbers[i])+" ");
        }
        bw.flush();
    }

}
