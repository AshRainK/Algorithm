import java.util.Scanner;

public class P_2525 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hour,minute,time;
        hour = scanner.nextInt();
        minute = scanner.nextInt();
        time = scanner.nextInt();
        minute = minute+time;
        hour += minute/60;
        minute %= 60;
        hour %= 24;
        System.out.println(hour+" "+minute);
    }

}
