import java.io.*;
import java.util.*;

public class P_11723 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        List<Integer> all = new ArrayList<>();
        for(int i =0; i<20; i++){
            all.add(i+1);
        }
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String func = st.nextToken();
            if(func.equals("add")){
                int temp = Integer.parseInt(st.nextToken());
                if(!set.contains(temp))
                    set.add(temp);
            }
            else if(func.equals("remove")){
                int temp = Integer.parseInt(st.nextToken());
                if(set.contains(temp))
                    set.remove(temp);
            }
            else if(func.equals("check")){
                int temp = Integer.parseInt(st.nextToken());
                if(set.contains(temp))
                    bw.write("1");
                else
                    bw.write("0");
                if(i<n-1)
                    bw.write("\n");
            }
            else if(func.equals("toggle")){
                int temp = Integer.parseInt(st.nextToken());
                if(set.contains(temp))
                    set.remove(temp);
                else
                    set.add(temp);
            }
            else if(func.equals("all")){
                set.clear();
                set.addAll(all);
            }
            else if(func.equals("empty")){
                set.clear();
            }
        }
        bw.flush();
    }
}
