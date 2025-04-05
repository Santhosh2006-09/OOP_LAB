class Weather {
    private double temperature;
    private String condition;

    public Weather(double temperature, String condition) {
        this.temperature = temperature;
        this.condition = condition;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void updateWeather(double temp, String newCondition) {
        this.temperature = temp;
        this.condition = newCondition;
        System.out.println("Weather updated successfully.");
    }
}


public class WeatherApp {
    public static void main(String[] args) {
        Weather todayWeather = new Weather(28.5, "Sunny");

        System.out.println("Temperature: " + todayWeather.getTemperature() + "°C");
        System.out.println("Condition: " + todayWeather.getCondition());

        todayWeather.updateWeather(30.0, "Cloudy");
        System.out.println("Updated Condition: " + todayWeather.getCondition());
    }
}
