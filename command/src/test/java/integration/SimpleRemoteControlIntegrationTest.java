package integration;

import domain.entities.commands.Light;
import domain.entities.commands.Stereo;
import service.commands.StereoOffWithCDCommand;
import service.commands.*;
import service.invoker.RemoteControl;

/**
 * Created by Deniel on 13.10.2014.
 */
public class SimpleRemoteControlIntegrationTest {

    public static void main(String[] args){

        RemoteControl remote = new RemoteControl();

        Light light = new Light();
        Stereo stereo = new Stereo();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        Command stereoOn = new StereoOnWithCDCommand(stereo);
        Command stereoOff = new StereoOffWithCDCommand(stereo);

        System.out.println(remote);

        remote.undoButtonWasPushed();
        remote.setCommand(0,lightOn,lightOff);
        remote.setCommand(1,stereoOn,stereoOff);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();

        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.undoButtonWasPushed();

//        remote.onButtonWasPushed(6);
//        remote.offButtonWasPushed(6);
//        remote.undoButtonWasPushed();

        remote.undoButtonWasPushed();

        System.out.println(remote);
    }
}
