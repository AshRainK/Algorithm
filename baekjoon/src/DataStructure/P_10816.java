import java.io.*;
import java.util.*;

public class P_10816 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N 받아오기
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer,Integer> data = new HashMap<>();
        List<Integer> keys = new ArrayList<>();
        for(int i = 0; i<N; i++){ // 데이터 맵에 삽입
            int num = Integer.parseInt(st.nextToken());
            if(data.containsKey(num))
                data.replace(num,data.get(num)+1);
            else{
                data.put(num,1);
                keys.add(num);
            }
        }

        int M = Integer.parseInt(br.readLine()); // M 받아오기
        Collections.sort(keys);
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++){
            int num = Integer.parseInt(st.nextToken());
            int index = Collections.binarySearch(keys,num);
            if(index >= 0){
                if(i == M-1)
                    bw.write(data.get(num)+"");
                else
                    bw.write(data.get(num)+" ");
            } else{
                if(i == M-1)
                    bw.write("0");
                else
                    bw.write("0 ");
            }
        }
        bw.flush();
    }

}
