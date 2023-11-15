package Greedy;

import java.io.*;
import java.util.StringTokenizer;

public class P_1541 {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        long result = 0;
        StringTokenizer st = new StringTokenizer(s, "-");
        int len = st.countTokens();
        for(int i = 0; i<len; i++){
            long temp = 0;
            StringTokenizer stPlus = new StringTokenizer(st.nextToken(),"+");
            while(stPlus.hasMoreTokens()){
                temp += Long.parseLong(stPlus.nextToken());
            }
            if(i == 0){
                result += temp;
            }
            else{
                result -= temp;
            }
        }
        bw.write(result+"");
        bw.flush();
    }


}
