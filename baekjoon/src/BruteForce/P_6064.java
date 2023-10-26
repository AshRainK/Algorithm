package BruteForce;
import java.io.*;
import java.util.StringTokenizer;

public class P_6064 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            boolean flag = false;
            for(int j = x; j<M*N; j+=M){
                if(j % N == y){
                    bw.write(j+1+"\n");
                    flag = true;
                    break;
                }
            }
            if(!flag)
                bw.write("-1\n");
        }
        bw.flush();
    }

}
