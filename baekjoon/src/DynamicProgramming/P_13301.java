package DynamicProgramming;

import java.io.*;
import java.math.BigInteger;

public class P_13301 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        BigInteger bigInteger[] = new BigInteger[N+3];
        bigInteger[1] = BigInteger.valueOf(1);
        bigInteger[2] = BigInteger.valueOf(2);
        bigInteger[3] = BigInteger.valueOf(3);
        for(int i =4; i<=N; i++){
            bigInteger[i] = bigInteger[i-1].add(bigInteger[i-2]);
        }
        if(N>1){
            bw.write(bigInteger[N].multiply(BigInteger.valueOf(2)).add(bigInteger[N-1].multiply(BigInteger.valueOf(2))).toString());
        }
        else
            bw.write(bigInteger[1].multiply(BigInteger.valueOf(4)).toString());
        bw.flush();
    }

}
