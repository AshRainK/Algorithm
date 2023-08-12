package DataStructure;

import java.io.*;
import java.util.*;

public class P_13414 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new LinkedHashSet<>();
        List<String> list = new ArrayList<>();
        String str[] = br.readLine().split(" ");
        int K = Integer.parseInt(str[0]);
        int L = Integer.parseInt(str[1]);
        for(int i = 0; i<L; i++){
            String sNumber = br.readLine();
            if(set.contains(sNumber))
                set.remove(sNumber);
            set.add(sNumber);
        }
        list.addAll(set);
        if(list.size()<K){
            for(int i = 0; i<list.size(); i++)
                bw.write(list.get(i)+"\n");
        }
        else{
            for(int i = 0; i<K; i++)
                bw.write(list.get(i)+"\n");
        }
        bw.flush();
    }

}
