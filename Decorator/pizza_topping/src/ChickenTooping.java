public class ChickenTooping extends ADecorator{
    public ChickenTooping(IPizza toppedPizza){
        super(toppedPizza);
    }

    @Override
    public String getDes() {
        return super.getDes() + " + Extra Chicken added";
    }

    @Override
    public double cost() {
        return super.cost() + 60;
    }
}
