abstract class base {

    public final void makedinner(){
        gason();
        makeroti();
        addfilling();
        oventime();
        serve();
    }

    abstract void addfilling();
    abstract void oventime();

    void gason(){
        System.out.println("Fire up the gas and start cooking");
    }
    void makeroti(){
        System.out.println("Make a roti using flour and keep it for stable");
    }
    void serve(){
        System.out.println("Fine, Dinner is ready");
    }

}
