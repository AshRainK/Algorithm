import java.io.*;

public class P_4134 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        for(long i =0; i<n; i++){
            long temp = Long.parseLong(br.readLine());
            long result = find(temp);
            if(i == n-1)
                bw.write(result+"");
            else
                bw.write(result+"\n");
        }
        bw.flush();
    }

    public static long find(long x){
       if(x < 2)
           return 2;
       else{
           long temp  = x;
           while(!isPrime(temp)){
               temp ++;
           }
           return temp;
       }
    }

    public static boolean isPrime(long x){
        double sqrt = Math.sqrt(x);
        for(long i = 2; i<= sqrt; i++) {
            if(x % i == 0 )
                return false;
        }
        return true;
    }

}
