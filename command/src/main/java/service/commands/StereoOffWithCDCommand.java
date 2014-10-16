package service.commands;

import domain.entities.commands.Stereo;

/**
 * Created by Deniel on 13.10.2014.
 */
public class StereoOffWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
