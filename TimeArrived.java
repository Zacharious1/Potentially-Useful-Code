import java.util.Scanner;
public class TimeArrived {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current hour (24 hour time format): ");
        int hour = sc.nextInt();
        System.out.print("Enter current minute: ");
        int min = sc.nextInt();
        int hourArrived = hour + 5;
        int minArrived = min + 45;
        int hourOverflow = 0;
        int minOverflow;
        if (minArrived > 60)
        {
            hourOverflow = hourOverflow + 2;
            minOverflow = minArrived % 60;
            minArrived = 0 + minOverflow;
                
        }
        if (hourArrived < 23){
            if (minArrived < 10)
                System.out.print("You will arrive at " + hourArrived + ":0" + minArrived);
            if (minArrived >= 10)
                System.out.print("You will arrive at " + hourArrived + ":" + minArrived);
        }


        if (hourArrived > 23)
        {
            hourOverflow = hourOverflow + hourArrived % 24;
            hourArrived = 0 + hourOverflow;
            if (minArrived < 10)
                System.out.print("You will arrive at " + hourArrived + ":0" + minArrived + " tomorrow");
            if (minArrived >= 10)
                System.out.print("You will arrive at " + hourArrived + ":" + minArrived + " tomorrow");
        }

    }
}