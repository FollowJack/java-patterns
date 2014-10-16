package service.commands;

import domain.entities.commands.CeilingFan;

/**
 * Created by Deniel on 13.10.2014.
 */
public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
        ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (prevSpeed){
            case CeilingFan.HIGH : ceilingFan.high();break;
            case CeilingFan.MEDIUM : ceilingFan.medium();break;
            case CeilingFan.LOW : ceilingFan.low();break;
            case CeilingFan.OFF : ceilingFan.off();break;
        }
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }
}
