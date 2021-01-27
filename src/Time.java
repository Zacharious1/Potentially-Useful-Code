//Help Received: none
public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds /1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        second = totalSeconds % 60;
        minute = totalMinutes % 60;
        hour = totalHours % 24;
    }

    public Time(long elapsed) {
        long totalSeconds = elapsed /1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        second = totalSeconds % 60;
        minute = totalMinutes % 60;
        hour = totalHours % 24;
    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime /1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        second = totalSeconds % 60;
        minute = totalMinutes % 60;
        hour = totalHours % 24;
    }

    @Override
    public String toString() {
        return this.getHour() + ":" + this.getMinute() + ":" + this.getSecond();
    }
}
