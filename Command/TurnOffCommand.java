package Command;

public class TurnOffCommand  implements ICommand {
    private IReciever device;

    public TurnOffCommand(IReciever device) {
        this.device = device;
    }

    public void execute() {
        device.turnOff();
    }

}
