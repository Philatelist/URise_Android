/* 4. Построить программу для работы с классом для хранения данных о погоде (направление, скорость ветра, температура,
        облачность, осадки). Программа должна обеспечивать простейшие функции: ввод значений, вывод значений.
        */

public class Task04_Weather {

    private String windDirection = "SSW";
    private double windSpeed = 32;
    private double temperature = 18;
    private double cloudy = 45;
    private double rain = 13;

    public void getAllData() {
        System.out.println("Wind Direction = " + windDirection + ";\n"
                + "Wind Speed = " + windSpeed + " km/h;\n"
                + "Temperature = " + temperature + " Celsius;\n"
                + "Cloudy = " + cloudy + "%;\n"
                + "Rain = " + rain + "%;");
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getCloudy() {
        return cloudy;
    }

    public void setCloudy(double cloudy) {
        this.cloudy = cloudy;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public static void main(String[] args) {
        Task04_Weather test = new Task04_Weather();
        test.getAllData();
        System.out.println("");
        test.setWindDirection("North");
        test.setWindSpeed(31);
        test.setTemperature(36);
        test.setCloudy(1);
        test.setRain(0);
        test.getAllData();
    }
}
