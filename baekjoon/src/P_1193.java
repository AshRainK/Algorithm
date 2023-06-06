import java.io.*;

public class P_1193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        int count=0,sum = 0; //
        while(true){
            if(x<=sum){
                if(count%2 == 0){ //분모가 큰 쪽 부터
                  int lineCount = x-sum+count;
                  int l = lineCount;
                  int r = count-lineCount+1;
                  bw.write(l+"/"+r);
                } else{
                    int lineCount = x-sum+count;
                    int r = lineCount;
                    int l = count-lineCount+1;
                    bw.write(l+"/"+r);
                }
                break;
            } else{
                count++;
                sum += count;
            }
        }
        bw.flush();
    }

}
