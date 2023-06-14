import java.io.*;
import java.util.*;

public class P_5430 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T; i++){
            String p = br.readLine();
            Deque<Integer> deq = new ArrayDeque<>();
            int n = Integer.parseInt(br.readLine());
            String arr = br.readLine();
            arr = arr.replaceAll("]","");
            arr = arr.replaceAll("\\[","");
            StringTokenizer st = new StringTokenizer(arr,",");
            for(int k = 0; k<n; k++)
                deq.add(Integer.parseInt(st.nextToken())); // 여기까지 데이터 입력
            boolean error = false;
            int count = 0;
            for(int j = 0; j<p.length(); j++) {
                if(p.charAt(j) == 'R'){
                    count++;
                }
                else if(p.charAt(j) == 'D')
                {
                    if(deq.size() == 0){
                        error = true;
                        break;
                    }
                    else{
                        if(count % 2 == 0)
                            deq.removeFirst();
                        else
                            deq.removeLast();
                    }
                }
            }
            if(error){
                if(i < (T-1))
                    bw.write("error\n");
                else
                    bw.write("error");
            }
            else{
                bw.write("[");
                if(count % 2 == 0){ // 정상 출력
                    while(deq.size()>0){
                        int t = deq.removeFirst();
                        if(deq.size() == 0)
                            bw.write(t+"");
                        else
                            bw.write(t+",");
                    }
                }
                else{
                    while(deq.size()>0){
                        int t = deq.removeLast();
                        if(deq.size() == 0)
                            bw.write(t+"");
                        else
                            bw.write(t+",");
                    }
                }
                if(i < (T-1))
                    bw.write("]\n");
                else
                    bw.write("]");
            }
        }
        bw.flush();
    }

}
