package Greedy;
import java.io.*;
import java.util.Arrays;

public class P_10610 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char chars[] = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        Arrays.sort(chars);
        long sum = 0;
        int len = chars.length;
        for(int i = 0; i<len; i++){
            if(chars[i] == '0')
                continue;
            sum+= chars[i]-'0';
        }
        if(sum % 3 == 0 && chars[0] == '0'){
            for(int i = len-1; i>=0; i--)
                sb.append(chars[i]);
            bw.write(sb.toString());
        }
        else
            bw.write("-1");
        bw.flush();
    }

}
