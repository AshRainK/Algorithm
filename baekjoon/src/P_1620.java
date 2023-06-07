import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P_1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String,String> pokemon = new HashMap<>();
        Map<String,String> number = new HashMap<>();
        for(int i =0; i<n; i++){
            String str = br.readLine();
            pokemon.put(String.valueOf(i+1), str);
            number.put(str,String.valueOf(i+1));
        }
        for(int i=0; i<m; i++){
            String temp = br.readLine();
            if(pokemon.containsKey(temp)){
                bw.write(pokemon.get(temp)+"");
                if(i<m-1)
                    bw.write("\n");
            }
            else if(number.containsKey(temp)){
                bw.write(number.get(temp)+"");
                if(i<m-1)
                    bw.write("\n");
            }
        }
        bw.flush();
    }

}
