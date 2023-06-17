import java.io.*;
import java.util.*;

public class P_20920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<String> words = new ArrayList<>();
        Map<String, Integer> checker = new HashMap<>();
        List<Words> wordpad = new ArrayList<>();
        Comp comp = new Comp();
        for(int i=0; i<N; i++){
            String word = br.readLine();
            if(word.length()<M)
                continue;
            if(checker.containsKey(word))
                checker.replace(word,checker.get(word)+1);
            else{
                checker.put(word,1);
                words.add(word);
            }
        }
        for(int i = 0; i < words.size(); i++){
            String temp = words.get(i);
            wordpad.add(new Words(temp,checker.get(temp)));
        }
        Collections.sort(wordpad,comp);
        for(int i = 0; i< wordpad.size(); i++){
            Words temp = wordpad.get(i);
            bw.write(temp.word);
            if(i<wordpad.size()-1)
                bw.write("\n");
        }
        bw.flush();
    }

    public static class Words{
        private String word;
        private int count;

        public Words(String word, int count){
            this.word = word;
            this.count = count;
        }
    }

    public static class Comp implements Comparator<Words>{
        @Override
        public int compare(Words o1, Words o2) {
            if(o1.count > o2.count){
                return -1;
            }
            else if(o1.count == o2.count){
                if(o1.word.length()> o2.word.length())
                    return -1;
                else if(o1.word.length() == o2.word.length()){
                    return o1.word.compareTo(o2.word);
                }
                else
                    return 1;
            }
            else
                return 1;
        }
    }

}
