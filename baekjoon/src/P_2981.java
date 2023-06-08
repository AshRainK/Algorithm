import java.io.*;
import java.util.*;

public class P_2981 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int numbers[] = new int[n];
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<n; i++) // 숫자 받기
            numbers[i] = Integer.parseInt(br.readLine());

        Arrays.sort(numbers); // 정렬

        int bottom = numbers[1] - numbers[0]; // 초기 차들의 값으로 설정

        for(int i = 2; i < n; i++){ // 차들의 gcd 구하기
            int dis = numbers[i] - numbers[i-1];
            bottom = gcd(bottom, dis);
        }

        for(int i = 2; i <= bottom; i++){ // 차들의 gcd보다 작은 것 중 자기 자신으로 나누어지는 것이 있는지 확인
            if(bottom % i == 0)
                result.add(i);
        }

        for(int i = 0; i < result.size()-1; i++) {
            bw.write(result.get(i) + " ");
        }
        if(result.size() > 0) {
            bw.write(result.get(result.size()-1) + "");
        }

        bw.flush();
    }

    public static int gcd(int x, int y){
        if(y == 0)
            return x;
        else
            return gcd(y, x%y);
    }

}
