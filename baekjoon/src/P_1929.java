import java.io.*;
import java.util.StringTokenizer;

public class P_1929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        if(n == 1)
            n = 2;
        for(long i = n; i<=m; i++){
            if(isPrime(i)) {
                if(i == m)
                    bw.write(i+"");
                else
                    bw.write(i+"\n");
            }
        }
        bw.flush();
    }

    public static boolean isPrime(long x){
        double sqrt = Math.sqrt(x);
        if(x < 2)
            return true;
        for(int i = 2; i<=sqrt; i++){
            if(x%i == 0)
                return false;
        }
        return true;
    }

}
