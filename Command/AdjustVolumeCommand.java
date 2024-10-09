package Command;

public class AdjustVolumeCommand implements ICommand {

    private Stereo stereo;

    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.adjustVolume();
    }
}
