package RealHomework.Tema7;

public class TV {
    int channel;
    int volumeLevel;
    boolean on;

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (!on) {
            System.out.println("The TV isn't on.");
            return;
        }
        if (newChannel < 1 || newChannel > 120) System.out.println("Invalid channel selected.");
        else channel = newChannel;
    }
    public void setVolume(int newVolumeLevel) {
        if (!on) {
            System.out.println("The TV isn't on.");
            return;
        }
        if (newVolumeLevel < 1 || newVolumeLevel > 7) System.out.println("Invalid volume selected.");
        else volumeLevel = newVolumeLevel;
    }

    public void channelUp() {
        if (!on) {
            System.out.println("The TV isn't on.");
            return;
        }
        if (channel >= 120) System.out.println("You can't go to channel after 120.");
        else channel++;
    }
    public void channelDown() {
        if (!on) {
            System.out.println("The TV isn't on.");
            return;
        }
        if (channel <= 1) System.out.println("There are no non-positive channels.");
        else channel--;
    }

    public void volumeUp() {
        if (!on) {
            System.out.println("The TV isn't on.");
            return;
        }
        if (volumeLevel >= 7) System.out.println("You can't increase the volume to more than 7.");
        else volumeLevel++;
    }
    public void volumeDown() {
        if (!on) {
            System.out.println("The TV isn't on.");
            return;
        }
        if (channel <= 1) System.out.println("You can't reduce the volume below 1.");
        else channel--;
    }
}
