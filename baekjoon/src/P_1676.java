import java.io.*;
import java.nio.Buffer;

public class P_1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count2 = 0;
        int count5 = 0;
        int result = 0;
        for(int i =N; i>1; i--){
            int temp = i;
            while( temp % 2 == 0 || temp % 5 == 0){
                if(temp % 2 == 0) {
                    count2++;
                    temp /= 2;
                }
                else if(temp % 5 == 0){
                    count5++;
                    temp /= 5;
                }
            }
        }
        if(count2>0 && count5>0){
            if(count2 > count5)
                result = count5;
            else
                result = count2;
        }
        bw.write(result+"");
        bw.flush();
    }

}
