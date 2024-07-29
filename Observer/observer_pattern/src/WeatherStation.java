import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String weather;
    private float temp;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather,temp);
        }
    }

    public void setWeather(String newWeather, float newTemp) {
        this.weather = newWeather;
        this.temp = newTemp;
        notifyObservers();
    }
}
