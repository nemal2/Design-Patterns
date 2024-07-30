public class BaseDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor Basic() is not visible
        //Basic object = new Basic();

        //Get the only object available
        Basic object = Basic.getInstance();

        //show the message
        object.showMessage();
    }
}