import java.io.*;
import java.util.StringTokenizer;

public class P_13241 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long gcd = gcd(a,b);
        long result = a*b/gcd;
        bw.write(result+"");
        bw.flush();
    }

    public static long gcd(long x, long y){
        if(y == 0)
            return x;
        else
            return gcd(y,x%y);
    }


}
