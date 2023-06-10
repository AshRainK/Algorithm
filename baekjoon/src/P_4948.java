import java.io.*;

public class P_4948 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        while(true){
            int result = 0;
            if(n == 0)
                break;
            for(long i = n+1; i<=2*n; i++){
                if(isPrime(i))
                    result++;
            }
            n = Long.parseLong(br.readLine());
            if(n == 0)
                bw.write(result+"");
            else
                bw.write(result+"\n");
        }
        bw.flush();
    }

    public static boolean isPrime(long x) {
        double sqrt = Math.sqrt(x);
        if (x < 2)
            return false;
        for(int i=2; i<=sqrt; i++){
            if(x%i == 0)
                return false;
        }
        return true;
    }

}
