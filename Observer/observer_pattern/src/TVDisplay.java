class TVDisplay implements Observer {
    private String weather;
    private float temp;

    @Override
    public void update(String weather, float temp) {
        this.weather = weather;
        this.temp = temp;
        display();
    }

    private void display() {
        System.out.println("TV Display: Weather updated - " + weather);
        System.out.println("TV Display: Temperature updated - " + temp);
    }
}
