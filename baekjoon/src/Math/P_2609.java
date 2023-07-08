import java.io.*;

public class P_2609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int gcd = gcd(A,B);
        A /= gcd;
        B /= gcd;
        bw.write(gcd+"\n");
        bw.write(gcd*A*B+"");
        bw.flush();
    }


    public static int gcd(int a, int b){
        if( b == 0)
            return a;
        else
           return gcd(b, a%b);
    }

}
