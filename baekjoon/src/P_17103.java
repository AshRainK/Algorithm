import java.io.*;

public class P_17103 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        boolean prime[] = new boolean[1000000-2];

        for(int i = 0; i<1000000-2; i++){
            prime[i] = isPrime(i+2);
        }

        for(int i =0; i<T; i++){
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            for(int j =2; j <= n/2 ; j++) {
                if (prime[j-2]) {
                    if (prime[n-j-2])
                        count++;
                }
            }
            if(i == T-1)
                bw.write(count+"");
            else
                bw.write(count+"\n");
        }
        bw.flush();
    }

    public static boolean isPrime(int x){
        double sqrt = Math.sqrt(x);
        if(x<2)
            return false;
        for(int i =2; i<=sqrt; i++){
            if(x % i == 0)
                return false;
        }
        return true;
    }

}
