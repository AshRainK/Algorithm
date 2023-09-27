package String;

import java.io.*;

public class P_3449 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++){
            int count = 0;
            String str1 = br.readLine();
            String str2 = br.readLine();
            for(int j = 0; j<str1.length(); j++){
                if(str1.charAt(j) != str2.charAt(j))
                    count++;
            }
            bw.write("Hamming distance is "+count+".\n");
        }
        bw.flush();
    }

}
