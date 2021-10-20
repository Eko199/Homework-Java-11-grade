package RealHomework.Tema7;

public class TVTest {
    public static void main(String[] args) {
        TV tv = new TV(1, 1, false);
        tv.setChannel(12);
        tv.turnOn();
        tv.volumeUp();
        tv.setChannel(2);
        tv.channelDown();
        tv.setVolume(7);
        tv.volumeUp();
        tv.turnOff();
        System.out.println(tv.channel);
        System.out.println(tv.volumeLevel);
        System.out.println(tv.on);
    }
}
