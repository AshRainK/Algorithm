import java.io.*;
import java.util.StringTokenizer;

public class P_1018 {

    public static void main(String[] args) throws IOException { //문제를 잘 읽고 패턴을 익혀야함...
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char board[][] = new char[n][m];
        //1. 보드판 삽입
        for(int i =0; i<n; i++){
            char[] str = br.readLine().toCharArray();
            for(int j = 0; j<m; j++)
                board[i][j] = str[j];
        }
        // 2. 보드판 검증
        int min = 64; // 다 칠하는 경우는 8*8임
        for(int i=0; i<n-7; i++){
            for(int j=0; j<m-7; j++){ // 8*8이 가능한 경우의 수 모두 루프
                int count = 0; // 몇개 고칠지 카운팅
                char first = board[i][j]; // 맨 첫칸의 색
                for(int k = i; k<i+8; k++){
                    for(int l=j; l<j+8; l++){
                        if(board[k][l] != first) //색이 다르면 카운트 +1
                            count ++;
                        if(first == 'B') // 옆칸으로 갈때 색 바꿔주기
                            first = 'W';
                        else if(first =='W')
                            first = 'B';
                    }
                    if(first == 'B') // 아래줄로 갈때 색 바꿔주기
                        first = 'W';
                    else if(first =='W')
                        first = 'B';
                }
                count = Math.min(count,64-count); //흰색기준으로 칠했을때와 검은색기준으로 칠했을때의 합은 64
                min = Math.min(count,min); // 원래 최소값과 계산한 값중 최소값을 min에 저장
            }
        }
        bw.write(min+"");
        bw.flush();
    }

}
