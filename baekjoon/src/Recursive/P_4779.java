package Recursive;

import java.io.*;

public class P_4779 {

    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while((input = br.readLine())!=null){
            sb = new StringBuilder();
            int n = Integer.parseInt(input);
            int key = (int) Math.pow(3,n);
            rec(key);
            sb.append("\n");
            bw.write(sb.toString());
        }
        bw.flush();
    }


    public static void rec(int key){
        if(key == 1){
            sb.append('-');
            return;
        }
        int idx = key/3;
        rec(idx);
        for(int i = 0; i<idx; i++){
            sb.append(" ");
        }
        rec(idx);
    }


}
