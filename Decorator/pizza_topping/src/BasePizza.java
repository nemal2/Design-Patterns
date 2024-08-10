// concrete component using the interface
public class BasePizza implements IPizza{

    @Override
    public String getDes() {
        return "This is a Pan Pizza";
    }

    @Override
    public double cost() {
        return 100;
    }
}
