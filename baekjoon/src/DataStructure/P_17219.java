import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P_17219 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String,String> password = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            String site = st.nextToken();
            String pw = st.nextToken();
            password.put(site,pw);
        }
        for(int i = 0; i<M; i++){
            bw.write(password.get(br.readLine()));
            if(i < M-1)
                bw.write("\n");
        }
        bw.flush();
    }

}
