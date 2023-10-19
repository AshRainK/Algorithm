import java.util.Scanner;

public class SWEA_1206 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            System.out.print("#"+test_case+" ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            long sum = 0;
            for(int i = 0; i<n; i++)
                arr[i] = sc.nextInt();
            for(int i = 2; i<n-2; i++){
                int max = 0;
                for(int j = i-2; j<i; j++)
                    max = Math.max(arr[j],max);
                for(int j = i+1; j<i+3; j++)
                    max = Math.max(arr[j],max);
                int current = arr[i];
                if(current > max)
                    sum += (current-max);
            }
            System.out.println(sum);
        }
    }

}
