package pl.annamarseniuk.obiektowe.model;

import pl.annamarseniuk.obiektowe.enums.FishEnum;

public class Fish {
    FishEnum fish;
    double weight;
    double length;

    public Fish(FishEnum fish, double weight, double length) {
        this.fish = fish;
        this.weight = weight;
        this.length = length;
    }

    public FishEnum getFish() {
        return fish;
    }

    public void setFish(FishEnum fish) {
        this.fish = fish;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
