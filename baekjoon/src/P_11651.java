import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P_11651 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Point arr[] = new Point[n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(arr,new Comp());
        for(Point p : arr){
            bw.write(p.x+" "+p.y+"\n");
        }
        bw.flush();
    }

    public static class Point{
        private int x;
        private int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static class Comp implements Comparator<Point> {
        @Override
        public int compare(Point o1, Point o2) {
            if(o1.y > o2.y)
                return 1;
            else if (o1.y == o2.y){
                if(o1.x > o2.x)
                    return 1;
                else if(o1.x == o2.x)
                    return 0;
                else
                    return -1;
            }
            else
                return -1;
        }
    }

}
