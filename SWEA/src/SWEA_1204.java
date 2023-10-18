import java.util.Scanner;


public class SWEA_1204 {

    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int caseNum = sc.nextInt();
            System.out.print("#"+caseNum+" ");
            int arr[] = new int[101];
            for(int i = 0; i<1000; i++){
                int idx = sc.nextInt();
                arr[idx]++;
            }
            int maxIdx = 0;
            for(int i = 1; i<=100; i++){
                if(arr[i] >= arr[maxIdx]){
                    maxIdx = i;
                }
            }
            System.out.println(maxIdx+"\n");
        }
    }
}
