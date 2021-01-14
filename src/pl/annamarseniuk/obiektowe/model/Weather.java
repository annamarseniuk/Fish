package pl.annamarseniuk.obiektowe.model;

import java.sql.Timestamp;

public class Weather {
    Timestamp time;
    String country;
    String city;
    double humidity;
    double temperature;
    double temperatureWater;
    double pressure;

    public Weather(Timestamp time, String country, String city, double humidity, double temperature, double temperatureWater, double pressure) {
        this.time = time;
        this.country = country;
        this.city = city;
        this.humidity = humidity;
        this.temperature = temperature;
        this.temperatureWater = temperatureWater;
        this.pressure = pressure;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperatureWater() {
        return temperatureWater;
    }

    public void setTemperatureWater(double temperatureWater) {
        this.temperatureWater = temperatureWater;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
