package pl.annamarseniuk.obiektowe.model;

import java.awt.*;
import java.sql.Timestamp;

public class Fishing {
    User user;
    Point start;
    Timestamp starTime;
    Point end;
    Timestamp endTime;
    Point[] point;
    Fish[] fish;
    String note;
    Photo[] photo;
    Weather[] weather;
    int status; //0-New, 1-Actually, 2-Planned, 3-Ended

    public Fishing(User user, Point start, Timestamp starTime, Point end, Timestamp endTime, Point[] point, Fish[] fish, String note, Photo[] photo, Weather[] weather, int status) {
        this.user = user;
        this.start = start;
        this.starTime = starTime;
        this.end = end;
        this.endTime = endTime;
        this.point = point;
        this.fish = fish;
        this.note = note;
        this.photo = photo;
        this.weather = weather;
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Timestamp getStarTime() {
        return starTime;
    }

    public void setStarTime(Timestamp starTime) {
        this.starTime = starTime;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Point[] getPoint() {
        return point;
    }

    public void setPoint(Point[] point) {
        this.point = point;
    }

    public Fish[] getFish() {
        return fish;
    }

    public void setFish(Fish[] fish) {
        this.fish = fish;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Photo[] getPhoto() {
        return photo;
    }

    public void setPhoto(Photo[] photo) {
        this.photo = photo;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
