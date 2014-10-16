package service.commands;

/**
 * Created by Deniel on 13.10.2014.
 */
public class NoCommand implements Command {
    @Override
    public void undo() {
        System.out.println("Nothing to undo.");
    }

    @Override
    public void execute() {
        System.out.println("No command.");
    }
}
