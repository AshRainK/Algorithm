import java.io.*;

public class P_11655 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        char[] result = new char[str.length()];
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if( c >= 'A' && c<='Z'){
                c -= 'A';
                c += 13;
                if(c > 25)
                    c %= 26;
                c += 'A';
                result[i] = c;
            }
            else if(c >='a' && c<='z'){
                c -= 'a';
                c += 13;
                if(c > 25)
                    c %= 26;
                c += 'a';
                result[i] = c;
            }
            else
                result[i] = c;
        }
        for(int i =0; i<result.length; i++){
            sb.append(result[i]);
        }
        bw.write(sb.toString());
        bw.flush();
    }

}
