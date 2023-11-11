package Greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P_1931 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Time> timeTable = new ArrayList<>();
        StringTokenizer st;
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            long start = Integer.parseInt(st.nextToken());
            long end = Integer.parseInt(st.nextToken());
            timeTable.add(new Time(start,end));
        }
        timeTable.sort(new Comp());
        long end = timeTable.get(0).end;
        int count = 1;
        for(int i = 1; i<N; i++){
            if(end<=timeTable.get(i).start){
                end = timeTable.get(i).end;
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
    }

    static class Time{
        long start;
        long end;
        public Time(long start, long end){
            this.start = start;
            this.end = end;
        }
    }

    static class Comp implements Comparator<Time>{
        @Override
        public int compare(Time o1, Time o2) {
            if(o1.end > o2.end)
                return 1;
            else if(o1.end == o2.end){
                if(o1.start>o2.start)
                    return 1;
                else if(o1.start == o2.start)
                    return 0;
                else
                    return -1;
            }

            else
                return -1;
        }
    }

}
