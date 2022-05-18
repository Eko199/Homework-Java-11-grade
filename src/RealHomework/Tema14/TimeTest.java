package RealHomework.Tema14;

public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);

        System.out.println(time1.hours + ":" + time1.minutes + ":" + time1.seconds);
        System.out.println(time2.hours + ":" + time2.minutes + ":" + time2.seconds);
        System.out.println(time3.hours + ":" + time3.minutes + ":" + time3.seconds);
    }
}
