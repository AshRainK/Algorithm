import java.io.*;
import java.util.*;

public class P_1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<Integer,String> cantListen = new HashMap<>();
        Set<String> cantSee = new HashSet<>();
        Set<String> result = new HashSet<>();
        int count = 0;
        for(int i = 0; i<n; i++)
            cantListen.put(i, br.readLine());
        for(int i =0; i<m; i++)
            cantSee.add(br.readLine());
        for(int i =0; i< cantListen.size(); i++){
            if(cantSee.contains(cantListen.get(i))){
                result.add(cantListen.get(i));
                count++;
            }
        }
        Object[] arr = result.toArray();
        Arrays.sort(arr);
        bw.write(count+"\n");
        for(int i=0; i<arr.length-1; i++)
            bw.write(arr[i]+"\n");
        if(arr.length>0)
            bw.write(arr[arr.length-1]+"");
        bw.flush();
    }

}
