package Greedy;
import java.io.*;

public class P_1343 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        s = s.replaceAll("XXXX","AAAA");
        s = s.replaceAll("XX","BB");
        if(s.contains("X"))
            bw.write("-1");
        else
            bw.write(s);
        bw.flush();
    }
}
