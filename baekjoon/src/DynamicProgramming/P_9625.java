import java.io.*;

public class P_9625 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int countA[] = new int [n+1];
        int countB[] = new int [n+1];
        countA[0] = 1;
        countB[0] = 0;
        countA[1] = 0;
        countB[1] = 1;
        for(int i = 2; i<=n; i++)
        {
            countA[i] = countB[i-1];
            countB[i] = countA[i-1] + countB[i-1];
        }
        bw.write(countA[n]+" "+countB[n]);
        bw.flush();
    }

}
