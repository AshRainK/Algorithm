package Graph;
import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class P_2178 {

    static int N,M;
    static int map[][];
    static int visited[][];
    static int dx[] = {0,0,1,-1};
    static int dy[] = {1,-1,0,0};



    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new int[N][M];
        for(int i = 0; i<N; i++){
            String str = br.readLine();
            for(int j = 0; j<M; j++)
                map[i][j] = str.charAt(j)-'0';
        }
        bfs(0,0);
        bw.write(visited[N-1][M-1]+"");
        bw.flush();
    }

    public static void bfs(int x, int y){
        visited[x][y] = 1;
        Queue<Point> queue = new LinkedList<>();
        for(int i = 0; i<4; i++){
            int newX = x+dx[i];
            int newY = y+dy[i];
            if(newX>=0 && newY>=0 && newX<N && newY<M){
                if(visited[newX][newY] == 0 && map[newX][newY] == 1){
                    visited[newX][newY] = visited[x][y]+1;
                    queue.add(new Point(newX,newY));
                }
            }
        }
        while(!queue.isEmpty()){
            Point point = queue.poll();
            int tempX = point.getX();
            int tempY = point.getY();
            for(int i = 0; i<4; i++){
                int newX = tempX+dx[i];
                int newY = tempY+dy[i];
                if(newX>=0 && newY>=0 && newX<N && newY<M){
                    if(visited[newX][newY] == 0 && map[newX][newY] == 1){
                        visited[newX][newY] = visited[tempX][tempY]+1;
                        queue.add(new Point(newX,newY));
                    }
                }
            }
        }
    }

    public static class Point{
        private int x;
        private int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

}
