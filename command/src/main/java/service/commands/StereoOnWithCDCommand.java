package service.commands;

import domain.entities.commands.Stereo;

/**
 * Created by Deniel on 13.10.2014.
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void undo() {
        stereo.off();
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

}
