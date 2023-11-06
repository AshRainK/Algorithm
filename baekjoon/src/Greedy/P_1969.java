package Greedy;
import java.io.*;
import java.util.StringTokenizer;

public class P_1969 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());
        char dnas[][] = new char[N][len];
        StringBuilder sb = new StringBuilder();
        int dis = 0;
        for(int i = 0; i<N; i++){
            dnas[i] = br.readLine().toCharArray();
        }
        for(int i = 0; i<len; i++){
            int countT = 0, countA = 0, countG = 0, countC = 0;
            for(int j = 0; j<N; j++){
                char c = dnas[j][i];
                if(c == 'T')
                    countT++;
                else if(c == 'A')
                    countA++;
                else if(c == 'G')
                    countG++;
                else if(c == 'C')
                    countC++;
            }
            if(countT > countA && countT>countG && countT>countC){
                sb.append('T');
                dis += countA+countG+countC;
            }
            else if(countA >= countT && countA >= countG && countA >= countC){
                sb.append('A');
                dis += countT+countG+countC;
            }
            else if(countG >= countT && countG > countA && countG > countC) {
                sb.append('G');
                dis += countA+countT+countC;
            }
            else if(countC > countA && countC >= countG && countC >= countT){
                sb.append('C');
                dis += countA+countT+countG;
            }
        }
        bw.write(sb.toString()+"\n");
        bw.write(dis+"");
        bw.flush();
    }

}
