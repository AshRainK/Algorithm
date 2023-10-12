package BruteForce;
import java.io.*;

public class P_1748 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long result = 0;
        int digit = 1;
        int end = 10;
        for(int i =1 ; i<=N; i++){
            if(i == end){
                digit++;
                end *= 10;
            }
            result += digit;
        }

        bw.write(result+"");
        bw.flush();
    }

}
