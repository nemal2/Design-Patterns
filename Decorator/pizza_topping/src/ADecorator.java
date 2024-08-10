// ADecorator is an abstract class, meaning it cannot be instantiated directly.
// Other classes must extend it
public abstract class ADecorator implements IPizza {
    protected IPizza toppingPizza;
    // The protected keyword means this field can be accessed:
    //  Within the ADecorator class.
    //  By any subclasses of ADecorator.
    //  By any classes in the same package

    public ADecorator(IPizza toppingPizza){
        this.toppingPizza = toppingPizza;
    }
    @Override
    public String getDes() {
        return toppingPizza.getDes();
    }

    @Override
    public double cost() {
        return toppingPizza.cost();
    }
}
