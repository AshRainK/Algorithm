package Greedy;
import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class P_13305 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cost[] = new int[n-1]; // n-1개의 비용
        int price[] = new int[n]; // n개의 가격
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0 ; i<n-1; i++){
            cost[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0 ; i<n; i++){
            price[i] = Integer.parseInt(st.nextToken());
        }
        BigInteger result = BigInteger.valueOf(0);
        for(int i = 0; i<n-1; i++){
            result = result.add(BigInteger.valueOf(cost[i]).multiply(BigInteger.valueOf(price[i])));
            if(price[i]<price[i+1])
                price[i+1] = price[i];
        }
        bw.write(result+"");
        bw.flush();
    }

}
