import java.io.*;
import java.util.HashMap;

public class P_1316 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String words[] = new String[n];
        Boolean result[] = new Boolean[n];

        //단어 받아오기
        for(int i=0; i<n; i++){
            words[i] = br.readLine();
        }

        // 단어 체크하기
        for(int i=0; i<n; i++){
            HashMap<Character,Boolean> checker = new HashMap<>();
            for(int j=0; j<words[i].length()-1; j++){
                if((words[i].charAt(j) != words[i].charAt(j+1)) && !checker.containsKey(words[i].charAt(j)))
                    checker.put(words[i].charAt(j),true);
                else if((words[i].charAt(j) != words[i].charAt(j+1)) && checker.containsKey(words[i].charAt(j)))
                    checker.replace(words[i].charAt(j),false);
            }
            if(checker.containsKey(words[i].charAt(words[i].length()-1))){
                checker.replace(words[i].charAt(words[i].length()-1),false);
            }
            if(checker.containsValue(false))
                result[i] = false;
            else{
                result[i] = true;
            }
        }
        int count = 0;
        for(int i=0; i<result.length; i++){
            if(result[i])
                count++;
        }
        bw.write(count+"");
        bw.flush();
    }


}
