//Help Received: none
public class TimeRunner {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5,23,55);

        System.out.println("Time 1 = " + time1.toString());
        System.out.println("Time 2 = " + time2.toString());
        System.out.println("Time 3 = " + time3.toString());
    }
}
