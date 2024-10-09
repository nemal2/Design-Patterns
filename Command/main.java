package Command;

public class main {

    public static void main(String[] args) {
        TV tv = new TV();
        Stereo stereo = new Stereo();

        ICommand turnOnCommand = new TurnOnCommand(tv);
        ICommand turnOffCommand = new TurnOffCommand(tv);
        ICommand changeChannelCommand = new ChangeChannelCommand(tv);
        ICommand adjustVolumeCommand = new AdjustVolumeCommand(stereo);


        Invoker remote = new Invoker();
        remote.setCommand(turnOnCommand);
        remote.pressButton();

        remote.setCommand(turnOffCommand);
        remote.pressButton();

        remote.setCommand(changeChannelCommand);
        remote.pressButton();

        remote.setCommand(adjustVolumeCommand);
        remote.pressButton();





}}