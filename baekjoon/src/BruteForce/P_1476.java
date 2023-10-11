package BruteForce;
import java.io.*;
import java.util.StringTokenizer;

public class P_1476 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken())%15;
        int S = Integer.parseInt(st.nextToken())%28;
        int M = Integer.parseInt(st.nextToken())%19;
        int year = 1;
        while(true){
            if(E ==1 && S == 1 && M == 1)
                break;
            else {
                if((year % 15 == E && year % 28 == S && year % 19 == M)){
                    break;
                }
                else
                    year++;
            }
        }
        bw.write(year+"");
        bw.flush();
    }

}
