import java.util.Scanner;

public class P_2884 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hour, minute;
        hour = scanner.nextInt();
        minute = scanner.nextInt();
        minute -= 45;
        if(minute<0){
            hour -=1;
            minute+=60;
            if(hour<0)
                hour+=24;
        }
        System.out.println(hour+" "+minute);
    }

}
