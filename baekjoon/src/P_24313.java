import java.io.*;
import java.util.StringTokenizer;

public class P_24313 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a1,a2,c,n0;
        boolean avail = true;
        StringTokenizer st = new StringTokenizer(br.readLine());
        a1 = Integer.parseInt(st.nextToken());
        a2 = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(br.readLine());
        n0 = Integer.parseInt(br.readLine());
        for(int i=n0; i<100; i++){
            if(i*a1+a2>c*i){
                avail = false;
                break;
            }
        }
        if(avail)
            bw.write("1");
        else
            bw.write("0");
        bw.flush();
    }

}
