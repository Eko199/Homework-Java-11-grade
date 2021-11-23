package RealHomework.Tema14;

public class Time {
     int hours;
     int minutes;
     double seconds;

    public Time() {
        Time time = new Time(System.currentTimeMillis());
        this.hours = time.hours + 2;
        this.minutes = time.minutes;
        this.seconds = time.seconds;
    }

    public Time(long milliseconds) {
        hours = (int) (milliseconds / 3600000) % 24;
        minutes = (int) ((milliseconds % 3600000) / 60000);
        seconds = (double) ((milliseconds % 60000) / 1000);
    }

    public Time(int hours, int minutes, double seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public double getSeconds() {
        return seconds;
    }

    public void setTime(long elapseTime) {
        Time time = new Time(System.currentTimeMillis());
        this.hours = time.hours;
        this.minutes = time.minutes;
        this.seconds = time.seconds;
    }
}
