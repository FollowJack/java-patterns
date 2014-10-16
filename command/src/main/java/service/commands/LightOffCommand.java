package service.commands;

import domain.entities.commands.Light;

/**
 * Created by Deniel on 13.10.2014.
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void undo() {
        light.on();
    }

    @Override
    public void execute() {
        light.off();
    }
}
