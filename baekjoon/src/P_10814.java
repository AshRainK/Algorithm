import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P_10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        People people[] = new People[n];
        Comp comp = new Comp();
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            people[i] = new People(Integer.parseInt(st.nextToken()), st.nextToken());
        }
        Arrays.sort(people,comp);
        for (People p: people) {
            bw.write(p.age+" "+p.name+"\n");
        }
        bw.flush();
    }

    public static class People{
        private int age;
        private String name;
        public People(int age, String name){
            this.age = age;
            this.name = name;
        }
    }

    public static class Comp implements Comparator<People>{

        @Override
        public int compare(People o1, People o2) {
            if(o1.age>o2.age)
                return 1;
            else if (o1.age == o2.age)
                return 0;
            else
                return -1;
        }
    }

}
