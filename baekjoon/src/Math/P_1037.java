import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P_1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int numbers[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);
        if(n == 1)
            result = numbers[0]*numbers[0];
        else{
            result = numbers[0]*numbers[numbers.length-1];
        }
        bw.write(result+"");
        bw.flush();
    }

}
