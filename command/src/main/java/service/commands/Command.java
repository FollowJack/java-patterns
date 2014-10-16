package service.commands;

/**
 * Created by Deniel on 13.10.2014.
 */
public interface Command {

    public void undo();
    public void execute();
}
