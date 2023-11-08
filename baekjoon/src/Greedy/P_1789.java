package Greedy;

import java.io.*;

public class P_1789 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long s = Long.parseLong(br.readLine());
        int n = 0;
        long sum = 0;
        int count = 0;
        while(true){
            sum+=++n;
            if(sum>s)
                break;
            count++;
        }
        bw.write(count+"");
        bw.flush();
    }

}
