package Mvc;

public class Mvc {

    public static void main(String[] args) {

        Student model = new Student();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.SetName("John");
        controller.SetId("12345");
        //controller.getName();
        //controller.getId();
        controller.updateView();
        controller.SetName("Jane");
        controller.SetId("67890");
        controller.updateView();
    }
}
