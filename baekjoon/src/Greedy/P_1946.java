package Greedy;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P_1946 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Comp comp = new Comp();
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t<T; t++){
            ArrayList<Applicant> applicants = new ArrayList<>();
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st;
            for(int i = 0; i<N; i++){
                st = new StringTokenizer(br.readLine(), " ");
                Applicant applicant = new Applicant(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
                applicants.add(applicant);
            }
            applicants.sort(comp);
            int count = 1;
            int min = applicants.get(0).meet;
            for(int i = 1; i<N; i++){
                int meet = applicants.get(i).meet;
                if(min>meet){
                    count++;
                    min = meet;
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
    }

    static class Applicant{
        int paper;
        int meet;
        public Applicant(int p, int m){
            this.paper = p;
            this.meet = m;
        }
    }

    static class Comp implements Comparator<Applicant>{

        @Override
        public int compare(Applicant o1, Applicant o2) {
            if(o1.paper>o2.paper)
                return 1;
            else if(o1.paper == o2.paper)
                return 0;
            else
                return -1;
        }
    }

}

