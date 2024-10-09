package Command;

public class ChangeChannelCommand implements ICommand {
    private TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.changeChannel();
    }
}
