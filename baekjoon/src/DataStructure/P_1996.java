package DataStructure;

import java.io.*;
import java.util.*;

public class P_1996 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T; i++){
            String str[] = br.readLine().split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            Queue<Integer> nums = new LinkedList<>();
            Queue<Integer> idx = new LinkedList<>();
            str = br.readLine().split(" ");
            boolean flag;
            int count = 0;
            for(int j = 0; j<N; j++){
                int temp = Integer.parseInt(str[j]);
                nums.add(temp);
                idx.add(j);
            }
            while(true){
                flag = true;
                int temp = nums.poll();
                int index = idx.poll();
                for(int j = 0; j<nums.size(); j++){
                    if(nums.peek()>temp){
                        flag = false;
                    }
                    int t = nums.poll();
                    nums.add(t);
                }
                if(flag) {
                    count ++;
                    if(index == M)
                        break;
                }
                else{
                    nums.add(temp);
                    idx.add(index);
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
    }

}
