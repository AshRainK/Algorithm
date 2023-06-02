import java.util.Scanner;

public class P_1010 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T, n, m;
        T = scanner.nextInt();
        for(int i=0; i<T; i++){
            n = scanner.nextInt();
            m = scanner.nextInt();
            int result = 1;
            for(int j =0; j<n; j++){
                result = result * (m-j)/(j+1);
            }
            System.out.println(result);
        }
    }

}
