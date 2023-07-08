import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P_1269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> setA = new HashSet<>();
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<a; i++)
            setA.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<b; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(!setA.contains(temp))
                result++;
        }
        int temp = a-(b-result);
        result += temp;

        bw.write(result+"");
        bw.flush();
    }

}
