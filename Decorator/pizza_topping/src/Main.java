public class Main {
    public static void main(String[] args) {

        IPizza pizza = new BasePizza();
        System.out.println(pizza.getDes());
        System.out.println(pizza.cost());

        pizza = new ChickenTooping(pizza);
        System.out.println(pizza.getDes());
        System.out.println(pizza.cost());

        pizza = new CheeseTopping(pizza);
        System.out.println(pizza.getDes());
        System.out.println(pizza.cost());
    }
}