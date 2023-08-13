package DataStructure;

import java.io.*;
import java.util.*;

public class P_2346 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<int[]> deq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        String str[] = br.readLine().split(" ");

        // 1. deq에 정수들 삽입하기
        for(int i = 0; i<N; i++){
            int num = Integer.parseInt(str[i]);
            deq.addLast(new int[]{num, i + 1});
        }
        // 2. deq에 정수들 확인하고 순서 정렬하기
        int count = 0;
        while(count<N){
            int[] top = deq.poll(); //맨 앞의 정수 빼기
            count++;
            if(!deq.isEmpty() && top[0]>0){ // 양수일 경우, 오른쪽으로 돌리기
                for(int i = 1; i<top[0]; i++){
                    deq.addLast(deq.pollFirst());
                }
            }
            else if (!deq.isEmpty() && top[0]<0){ // 음수일 경우, 왼쪽으로 돌리기
                for(int i = top[0]; i<0; i++){
                    deq.addFirst(deq.pollLast());
                }
            }
            sb.append(top[1]+" ");
        }
        // 출력하기
        bw.write(sb.toString());
        bw.flush();
    }

}
