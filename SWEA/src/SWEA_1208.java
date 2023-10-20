import java.util.Scanner;
import java.util.Arrays;


public class SWEA_1208
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            System.out.print("#"+test_case+" ");
            int count = sc.nextInt();
            int arr[] = new int[100];
            int max = 0;
            int min = 0;
            int diff = 0;
            for(int i = 0; i<100; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i<count; i++){
                Arrays.sort(arr);
                diff = arr[99]-arr[0];
                if(diff<1)
                    break;
                else{
                    arr[99]--;
                    arr[0]++;
                }
            }
            Arrays.sort(arr);
            diff = arr[99]-arr[0];
            System.out.println(diff);
        }
    }
}