package pl.annamarseniuk.obiektowe;

import pl.annamarseniuk.obiektowe.enums.FishEnum;
import pl.annamarseniuk.obiektowe.model.*;

import java.awt.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        User user = new User("Anna", "Marseniuk");
        Fish fish = new Fish(FishEnum.karp, 1.2, 15.0);
        Weather weather = new Weather(Timestamp.valueOf(LocalDateTime.now()), "Poland", "Wrocław", 90.1, 31.0, 20.0, 1024.0);
        Point startPoint = new Point(1, 2);
        Point endPoint = new Point(2, 1);
        Point[] points = new Point[0];
        Fish[] fishs = new Fish[0];
        Photo[] photos = new Photo[0];
        Weather[] weathers = new Weather[0];
        Fishing fishing = new Fishing(user,startPoint, Timestamp.valueOf(LocalDateTime.now()), endPoint, Timestamp.valueOf(LocalDateTime.now()), points, fishs, "", photos, weathers, 1);
    }
}
