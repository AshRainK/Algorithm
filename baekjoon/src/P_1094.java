import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_1094 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(bf.readLine());
        int sum = 64;
        int idx = 6;
        int result = 0;
        int arr[] = new int[7];
        arr[idx] = 1;

        while(x<sum){
            arr[idx--] -= 1;
            if(idx<0)
                break;
            arr[idx] = 1;
            sum = sum(arr);
            if(sum<x){
                arr[idx]+=1;
                sum = sum(arr);
            }
        }

        for(int i =0; i<arr.length; i++){
            if(arr[i]>0){
                result += arr[i];
            }
        }
        System.out.println(result);
    }

    public static int power2(int idx){
        int n = 1;
        for(int i=0; i<idx; i++){
            n=n*2;
        }
        return n;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + power2(i) * arr[i];
        }
        return sum;
    }

}
