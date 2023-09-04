package DynamicProgramming;

import java.io.*;

public class P_24417 {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int x = 1;
        int y = 1;
        int temp;
        for(int i = 3; i<=n; i++) {
            temp = y;
            y = (x+y) % 1000000007;
            x = temp;
        }
        bw.write( y +" "+(n-2));
        bw.flush();
    }




}
