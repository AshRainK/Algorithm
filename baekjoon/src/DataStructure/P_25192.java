import java.io.*;
import java.util.HashSet;
import java.util.Set;


public class P_25192 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> check = new HashSet<>();
        int result = 0;

        for(int i=0; i<N; i++){
            String st = br.readLine();
            if(st.equals("ENTER")) {
                result += check.size();
                check.clear();
            }
            else{
                check.add(st);
            }
        }

        result += check.size();

        bw.write(result+"");
        bw.flush();
    }

}
