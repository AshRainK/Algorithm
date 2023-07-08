import java.util.Scanner;

public class P_1032 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        String files[] = new String[50];
        n = scanner.nextInt();
        String pattern = "";
        for(int i=0; i<n; i++)
            files[i] = scanner.next();
        for(int i=0; i<files[0].length(); i++){
            char temp = files[0].charAt(i);
            int j=1;
            for(; j<n; j++){
                if(files[j].charAt(i) == temp){
                    continue;
                } else{
                    pattern = pattern+"?";
                    break;
                }
            }
            if(j==n)
                pattern = pattern+temp;
        }
        System.out.println(pattern);
    }

}
