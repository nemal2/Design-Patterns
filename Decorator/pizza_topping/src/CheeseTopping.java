// concrete decorators
public class CheeseTopping extends ADecorator{
    public CheeseTopping(IPizza toppedPizza) {
        super(toppedPizza);
    }

    @Override
    public String getDes() {
        return super.getDes() + " + Extra Cheese Added";
    }

    @Override
    public double cost() {
        return super.cost()+ 50;
    }
}
