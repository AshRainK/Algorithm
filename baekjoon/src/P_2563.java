import java.io.*;
import java.util.StringTokenizer;

public class P_2563 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int paper[][] = new int[100][100];
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i =0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j=x; j<x+10; j++){
                for(int k = y; k<y+10; k++){
                    if(paper[j][k] != 1){
                        paper[j][k] = 1;
                        count ++;
                    }
                }
            }
        }
        bw.write(count+"");
        bw.flush();
    }

}
