import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class P_1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String words[] = new String[n];
        for (int i = 0; i < n; i++)
            words[i] = bf.readLine();
        Arrays.sort(words,new sComparator());
        for(int i=0; i<words.length-1; i++){
            if(words[i].equals(words[i+1]))
                continue;
            System.out.println(words[i]);
        }
        System.out.println(words[words.length-1]);
    }

    public static class sComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            if(o1.length()>o2.length())
                return 1;
            else if(o1.length() == o2.length()){
                return o1.compareTo(o2);
            }
            else
                return -1;
        }
    }
}
