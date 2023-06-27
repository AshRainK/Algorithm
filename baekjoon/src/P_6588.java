import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class P_6588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = -1;
        Boolean[] prime = new Boolean[1000001];
        prime[0] = false;
        prime[1] = false;
        for(int i =2; i<1000001; i++) {
            prime[i] = true;
        }
        for(int i = 2; i<1000001; i++){
            if(!prime[i])
                continue;
            for(int j =2*i; j<1000001; j+=i){
                prime[j] = false;
            }
        }
        while(true){
            n = Integer.parseInt(br.readLine());
            int a = -1,b = -1;
            if(n == 0)
                break;
            for(int i =3; i<=n/2; i += 2){
                if(prime[i] && prime[n-i]){
                    a = i;
                    b= n-i;
                    break;
                }
            }
            if(a != -1 && b != -1){
                bw.write(n+" = "+a+" + "+b+"\n");
            }
            else
                bw.write("Goldbach's conjecture is wrong.\n");
        }
        bw.flush();
    }


}
