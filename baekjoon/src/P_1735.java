import java.io.*;
import java.util.StringTokenizer;

public class P_1735 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a1,a2,b1,b2;
        StringTokenizer st = new StringTokenizer(br.readLine());
        a1 = Integer.parseInt(st.nextToken());
        a2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        b1 = Integer.parseInt(st.nextToken());
        b2 = Integer.parseInt(st.nextToken());
        int sum1 = a1*b2 + b1*a2;
        int sum2 = b2*a2;
        int g = gcd(sum1,sum2);
        sum1 /= g;
        sum2 /= g;
        bw.write(sum1+" "+sum2);
        bw.flush();
    }

    public static int gcd(int x, int y){
        if(y == 0)
            return x;
        else
            return gcd(y, x%y);
    }

}
