package Greedy;
import java.io.*;
import java.util.StringTokenizer;

public class P_16953 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int answer = 0;
        while(true){
            if(start == end){
                answer++;
                break;
            }
            else if(start > end){
                answer = -1;
                break;
            }
            if(end % 2 == 0){
                end = end/2;
                answer++;
            }
            else if(end % 10 == 1){
                end = (end-1)/10;
                answer++;
            }
            else{
                answer = -1;
                break;
            }

        }
        bw.write(answer+"");
        bw.flush();
    }

}
