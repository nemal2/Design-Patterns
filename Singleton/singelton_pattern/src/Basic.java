public class Basic {
    //create an object of SingleObject
    private static Basic instance = new Basic();

    //make the constructor private so that this class cannot be
    //instantiated
    private Basic(){}

    //Get the only object available
    public static Basic getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

