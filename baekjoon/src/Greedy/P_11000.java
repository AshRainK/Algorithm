package Greedy;
import java.io.*;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.Comparator;

public class P_11000 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<TimeTable> timeTables = new ArrayList<>();
        StringTokenizer st;
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            long start = Long.parseLong(st.nextToken());
            long end = Long.parseLong(st.nextToken());
            timeTables.add(new TimeTable(start,end));
        }
        timeTables.sort(new Comp());
        PriorityQueue<TimeTable> pq = new PriorityQueue<>();
        pq.offer(timeTables.get(0));
        for(int i = 1; i<N; i++){
            TimeTable temp = timeTables.get(i);
            if(pq.peek().end<=temp.start)
                pq.poll();
            pq.offer(temp);
        }
        bw.write(pq.size()+"");
        bw.flush();
    }

    static class TimeTable implements Comparable<TimeTable>{
        long start;
        long end;
        public TimeTable(long start, long end){
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(TimeTable o) {
            return this.end == o.end ? 0 : (int) (this.end - o.end);
        }
    }

    static class Comp implements Comparator<TimeTable>{
        @Override
        public int compare(TimeTable o1, TimeTable o2) {
            if(o1.start > o2.start)
                return 1;
            else if(o1.start == o2.start){
                if(o1.end > o2.end)
                    return 1;
                else if(o1.end == o2.end)
                    return 0;
                else
                    return -1;
            }
            else
                return -1;
        }
    }

}
