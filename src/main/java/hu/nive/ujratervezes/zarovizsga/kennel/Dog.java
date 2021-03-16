package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {
    String name;
    int happiness = 0;

    Dog(String name) {
        this.name = name;
    }

    abstract void feed();

    abstract void play(int hours);

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }
}
