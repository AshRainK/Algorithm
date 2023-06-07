import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class P_1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        char numbers[] = str.toCharArray();
        Arrays.sort(numbers);
        for(int i=numbers.length-1; i>=0; i--){
            bw.write(numbers[i]+"");
        }
        bw.flush();
    }


}
