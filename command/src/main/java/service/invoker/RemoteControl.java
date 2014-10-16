package service.invoker;

import service.commands.Command;
import service.commands.NoCommand;

/**
 * Created by Deniel on 13.10.2014.
 */
public class RemoteControl {

    private static final int amountOfCommands = 7;

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[amountOfCommands];
        offCommands = new Command[amountOfCommands];

        Command noCommand = new NoCommand();
        for(int i = 0; i < amountOfCommands; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n===== Remote Control =====\n");
        for (int i = 0; i < amountOfCommands; i++) {
            stringBuffer.append("[slot "+i+"] "+onCommands[i].getClass().getName()
            +"   "+offCommands[i].getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }

}
