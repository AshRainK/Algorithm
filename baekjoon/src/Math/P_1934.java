import java.io.*;

public class P_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i =0 ;i<N; i++){
            String str[] = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int gcd = gcd(a,b);
            a /= gcd;
            b /= gcd;
            bw.write(a*b*gcd+"\n");
        }
        bw.flush();
    }

    public static int gcd(int a , int b){
        if(b == 0)
            return a;
        else
           return gcd(b,a%b);
    }
}