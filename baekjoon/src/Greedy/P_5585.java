package Greedy;
import java.io.*;

public class P_5585 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int coin[] = {500,100,50,10,5,1};
        int remain = 1000-N;
        int count = 0;
        int idx = 0;
        while(remain>0){
            int temp = remain/coin[idx];
            count += temp;
            remain -= coin[idx++] * temp;
        }
        bw.write(count+"");
        bw.flush();
    }

}
