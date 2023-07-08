import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class P_2635 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Random rand = new Random();
        int x = Integer.parseInt(br.readLine());
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=1; i<=x; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(x);
            temp.add(i);
            while(true){
                if(temp.get(temp.size()-2)-temp.get(temp.size()-1)<0)
                    break;
                temp.add(temp.get(temp.size()-2)-temp.get(temp.size()-1));
            }
            if(temp.size()>result.size())
                result = temp;
        }
        bw.write(result.size()+"\n");
        for(int i=0; i<result.size()-1; i++)
            bw.write(result.get(i)+" ");
        bw.write(result.get(result.size()-1)+"");
        bw.flush();
    }

}
