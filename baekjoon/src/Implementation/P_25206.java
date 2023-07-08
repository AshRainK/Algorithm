import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P_25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String,Double> grades = new HashMap<>();
        double result = 0;
        double count=0;
        grades.put("A+",4.5);
        grades.put("A0",4.0);
        grades.put("B+",3.5);
        grades.put("B0",3.0);
        grades.put("C+",2.5);
        grades.put("C0",2.0);
        grades.put("D+",1.5);
        grades.put("D0",1.0);
        grades.put("F",0.0);
        for(int i =0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String classes = st.nextToken();
            Double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if(!grade.equals("P")){
                result += score * grades.get(grade);
                count+=score;
            }
        }
        bw.write(result/count+"");
        bw.flush();
    }

}
