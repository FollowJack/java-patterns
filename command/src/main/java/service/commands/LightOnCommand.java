package service.commands;

import domain.entities.commands.Light;

/**
 * Created by Deniel on 13.10.2014.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void undo() {
        light.off();
    }

    @Override
    public void execute() {
        light.on();
    }


}
