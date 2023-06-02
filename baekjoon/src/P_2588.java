import java.util.Scanner;

public class P_2588 {

    public static void main(String[] args){
        int n1, n2;
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        scanner.close();
        System.out.println(n1*(n2%10));
        System.out.println(n1*((n2/10)%10));
        System.out.println(n1*(n2/100));
        System.out.println(n1*n2);
    }
}
