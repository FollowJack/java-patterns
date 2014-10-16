package service.commands;

/**
 * Created by Deniel on 13.10.2014.
 */
public class MacroCommand implements Command{

    private Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }
}
