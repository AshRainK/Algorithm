package Math;

import java.io.*;

public class P_2745 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String strs[] = br.readLine().split(" ");
        String str = strs[0];
        int num = Integer.parseInt(strs[1]);
        long sum = 0;
        long temp = 1;
        for(int i =str.length(); i>0; i--){
            char c = str.charAt(i-1);
            int t;
            if(c>'9'){
                t = c - 'A' + 10;
            }
            else{
                t = Integer.parseInt(String.valueOf(c));
            }
            sum += temp*t;
            temp *= num;
        }
        bw.write(sum+"\n");
        bw.flush();
    }

}
