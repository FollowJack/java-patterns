package domain.entities.commands;

/**
 * Created by Deniel on 13.10.2014.
 */
public class Stereo {

    private int volume;

    public void on() {
        System.out.println("Stereo on.");
    }

    public void setCD() {
        System.out.println("Set CD.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void off() {
        System.out.println("Stereo off.");
    }
}
