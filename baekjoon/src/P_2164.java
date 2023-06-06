import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class P_2164 {



    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> cards = new LinkedList<>();

            for(int i = 0; i<n; i++)
                cards.addLast(i+1);
        while(cards.size() !=1){
            cards.removeFirst(); // 첫번째카드 제거
            int addnum = cards.getFirst();
            cards.removeFirst(); // 두번째 카드 제거
            cards.addLast(addnum); // 두번째 카드 맨 뒤에 추가
        }
            bw.write(cards.peek()+"");
            bw.flush();
        }
}



