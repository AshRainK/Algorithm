package String;

import java.io.*;

public class P_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = 'Z' - 'A' + 1;
        int count[] = new int[len];
        String str = br.readLine();
        int max = 0;
        boolean equal = false;
        for(int i =0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c >='A' && c<='Z'){
                int temp = c - 'A';
                count[temp]++;
            }
            else{
                int temp = c - 'a';
                count[temp]++;
            }
        }
        for(int i = 1; i<len; i++){
            if(count[max] < count[i]){
                max = i;
                equal = false;
            }
            else if(count[max] == count[i])
                equal = true;
        }
        if(equal){
            bw.write("?");
        }
        else
            bw.write(max+'A');
        bw.flush();
    }

}
