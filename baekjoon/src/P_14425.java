import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P_14425 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = 0;
        Set<String> words = new HashSet<>();
        for(int i = 0; i<n; i++ )
            words.add(br.readLine());
        for(int i =0; i<m; i++){
            if(words.contains(br.readLine()))
                result++;
        }
        bw.write(result+"");
        bw.flush();
    }

}
