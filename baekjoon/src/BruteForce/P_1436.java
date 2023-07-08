import java.io.*;

public class P_1436 { // String은 불변객체로 생성되어 메모리 초과를 유발할 수 있음을 배움

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int temp = 666;
        int result=0;
        while(true){
            if(temp / 1000 == 0){
                if(temp == 666){
                    count ++;
                    if(count == n){
                        result = temp;
                        break;
                    }
                    temp = temp + 1000;
                }
            } else{
                char arr[] = String.valueOf(temp).toCharArray();
                for(int i =0; i<arr.length-2; i++){
                    if(arr[i] == '6' && arr[i+1] == '6' && arr[i+2] == '6'){
                        count++;
                        break;
                    }
                }
                if(count == n) {
                    result = temp;
                    break;
                }
                temp += 1;
            }
        }
        bw.write(result+"");
        bw.flush();
    }

}
