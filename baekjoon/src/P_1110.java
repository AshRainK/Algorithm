import java.io.*;

public class P_1110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int original = Integer.parseInt(br.readLine());
        if(original < 10)
            original *= 10;
        int number= original;
        int count = 0;
        do{
            int n1 = number/10;
            int n2 = number%10;
            number = n2*10 + (n1+n2)%10;
            count++;
        } while(original!=number);
        bw.write(count+"");
        bw.flush();
    }

}
