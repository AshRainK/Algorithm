package Greedy;
import java.io.*;
import java.util.*;

public class P_1049 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int total[] = new int[m];
        int separate[] = new int[m];
        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine()," ");
            total[i] = Integer.parseInt(st.nextToken());
            separate[i] = Integer.parseInt(st.nextToken());
        }
        int result = Integer.MAX_VALUE;
        if(n<=6){
            for(int i = 0; i<m; i++){
                result = Math.min(result,Math.min(total[i],separate[i]*n));
            }
        }
        else{
            int set = n/6;
            int sep = n-6*set;
            int money = Integer.MAX_VALUE;
            for(int i = 0; i<m; i++){
                money = Math.min(money,Math.min(total[i]*set,separate[i]*set*6));
            }
            for(int i = 0; i<m; i++){
                result = Math.min(result,Math.min(total[i]+money,separate[i]*sep+money));
            }
        }
        bw.write(result+"");
        bw.flush();
    }

}
