import java.io.*;

public class P_10808 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr[] = new int['z'-'a'+1];
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<str.length(); i++){
            char c = str.charAt(i);
            arr[c-'a']++;
        }
        for(int i =0; i<arr.length; i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
    }

}
