import java.io.*;
import java.util.*;

public class P_20291 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String,Integer> checker = new HashMap<>();
        List<String> extender = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            String str = br.readLine().split("\\.")[1];
            if(checker.containsKey(str)){
                int temp = checker.get(str);
                checker.replace(str,temp+1);
            }
            else{
                checker.put(str,1);
                extender.add(str);
            }
        }
        Collections.sort(extender);
        for(int i =0; i< extender.size(); i++){
            String name = extender.get(i);
            sb.append(name);
            sb.append(" ");
            sb.append(checker.get(name));
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }

}
