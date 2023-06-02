import java.util.Scanner;

public class P_1546 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        double max,sum;
        n = scanner.nextInt();
        double numbers[] = new double[n];

        for(int i = 0; i<n; i++){
            numbers[i] = scanner.nextInt();
        }
        max = max(numbers);
        sum=0;
        for(int i=0; i<n; i++){
            numbers[i] = (numbers[i]/max)*100;
            sum+= numbers[i];
        }
        System.out.println(sum/n);
    }

    public static double max(double[] arr){
        double max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(max<arr[i])
                max = arr[i];
        }
        return max;
    }


}
