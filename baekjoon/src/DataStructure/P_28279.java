package DataStructure;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class P_28279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new LinkedList<>();
        String str[];
        for(int i = 0; i<N; i++){
            str = br.readLine().split(" ");
            if(str[0].equals("1")){
                deq.addFirst(Integer.parseInt(str[1]));
            }
            else if(str[0].equals("2")){
                deq.addLast(Integer.parseInt(str[1]));
            }
            else if(str[0].equals("3")){
                if(deq.isEmpty()){
                    bw.write("-1\n");
                }
                else
                    bw.write(deq.pollFirst()+"\n");
            }
            else if(str[0].equals("4")){
                if(deq.isEmpty()){
                    bw.write("-1\n");
                }
                else
                    bw.write(deq.pollLast()+"\n");
            }
            else if(str[0].equals("5")){
                bw.write(deq.size()+"\n");
            }
            else if(str[0].equals("6")){
                if(deq.isEmpty())
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }
            else if(str[0].equals("7")){
                if(deq.isEmpty()){
                    bw.write("-1\n");
                }
                else
                    bw.write(deq.peekFirst()+"\n");
            }
            else if(str[0].equals("8")){
                if(deq.isEmpty()){
                    bw.write("-1\n");
                }
                else
                    bw.write(deq.peekLast()+"\n");
            }
        }
        bw.flush();
    }

}
