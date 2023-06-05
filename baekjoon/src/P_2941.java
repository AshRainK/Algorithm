import java.io.*;
import java.util.HashMap;

public class P_2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        HashMap<String,String> dictionary = new HashMap<>();
        int result = 0;
        dictionary.put("c=","  ");
        dictionary.put("c-","  ");
        dictionary.put("dz=","   ");
        dictionary.put("d-","  ");
        dictionary.put("lj","  ");
        dictionary.put("nj","  ");
        dictionary.put("s=","  ");
        dictionary.put("z=","  ");
        // 3단어 짜리 먼저 검사
        for(int i=0; i<str.length()-2; i++){
            if(dictionary.containsKey(str.substring(i,i+3))){
                str = str.replaceFirst(str.substring(i,i+3),dictionary.get(str.substring(i,i+3)));
                result++;
            }
        }
        //2단어 짜리 검사
        for(int i=0; i<str.length()-1; i++){
            if(dictionary.containsKey(str.substring(i,i+2))){
                str = str.replaceFirst(str.substring(i,i+2),dictionary.get(str.substring(i,i+2)));
                result++;
            }
        }
        str = str.replaceAll(" ","");
        result += str.length();
        bw.write(result+"");
        bw.flush();
    }

}
