package Command;

public class TurnOnCommand implements ICommand {
    private IReciever device;

    public TurnOnCommand(IReciever device) {
        this.device = device;
    }

    public void execute() {
        device.turnOn();
    }
}
