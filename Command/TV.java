package Command;

public class TV implements IReciever {

    @Override
    public void turnOn() {
        System.out.println("TV is on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is off");
    }


    public void changeChannel() {
        System.out.println("Channel changed");
    }

}

