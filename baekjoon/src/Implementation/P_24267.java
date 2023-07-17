package Implementation;

import java.io.*;

public class P_24267 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long N = Long.parseLong(br.readLine());
        long result = (N*(N-1)*(N-2))/6;
        bw.write(result+"\n"+"3");
        bw.flush();
    }


}
