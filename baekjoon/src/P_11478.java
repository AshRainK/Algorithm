import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class P_11478 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> substrings = new HashSet<>();
        String str = br.readLine();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings.add(str.substring(i, j));
            }
        }

        bw.write(substrings.size() + "");
        bw.flush();
    }
}