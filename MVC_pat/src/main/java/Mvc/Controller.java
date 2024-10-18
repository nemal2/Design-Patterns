package Mvc;

public class Controller {

    private Student model;
    private View view;

    public Controller(Student model, View view) {
        this.model = model;
        this.view = view;
    }

   public void SetName(String name) {
       model.setName(name);
   }
   public void SetId(String id) {
       model.setId(id);
   }

   public void getId() {
       view.printdata(model.getName(), model.getId());
   }
   public void getName() {
       view.printdata(model.getName(), model.getId());
   }

   public void updateView() {
       view.printdata(model.getName(), model.getId());
   }

}
