import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class P_2485 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int numbers[] = new int[n];
        Stack<Integer> gcd = new Stack<Integer>();
        for(int i =0; i<n; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        for(int i = 0; i< n-1; i++){ // 각 수들의 차 계산
            int dis = numbers[i+1]-numbers[i];
            if(gcd.empty()){
                gcd.push(dis);
            } else{
                int temp = gcd.pop();
                gcd.push(gcd(temp,dis));
            }
        }
        bw.write(((numbers[n-1]-numbers[0])/gcd.peek())+1-n+"");
        bw.flush();
    }

    public static int gcd(int x, int y){
        if(y == 0)
            return x;
        else
            return gcd(y,x%y);
    }

}
