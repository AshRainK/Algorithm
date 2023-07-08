import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P_5622 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int start = 2, count = 0;
        int result = 0;
        HashMap<Character,Integer> dial = new HashMap<>();
        int time[] = new int[9];

        for(int i=0; i<time.length; i++)
            time[i] = i+2;

        for(char i = 'A'; i<='Z'; i++){
            if(count>=3 && i!='Z' && i!='S'){
                count =0;
                start++;
            }
            dial.put(i,start);
            count++;
        }
        for(int i=0; i<str.length(); i++){
            char temp = str.charAt(i);
            int num = dial.get(temp);
            result += time[num-1];
        }
        bw.write(result+"");
        bw.flush();
    }

}
