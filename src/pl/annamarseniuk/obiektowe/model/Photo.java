package pl.annamarseniuk.obiektowe.model;

import java.sql.Timestamp;

public class Photo {
    Timestamp time;
    String source;
    User user;

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
