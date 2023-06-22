import java.io.*;
import java.util.*;

public class P_7785 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        Comp comp = new Comp();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if(state.equals("enter"))
                set.add(name);
            else if(state.equals("leave"))
                set.remove(name);
        }
        Object[] arr = set.toArray();
        Arrays.sort(arr,comp);
        int size = set.size();
        for(int i =0; i<size; i++){
            bw.write(String.valueOf(arr[i]));
            if(i<size-1)
                bw.write("\n");
        }
        bw.flush();
    }

    public static class Comp implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            return o1.toString().compareTo(o2.toString()) * -1;
        }
    }

}
