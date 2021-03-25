package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {
    private final String name;
    private int happiness;

    protected Dog(String name) {
        this.name = name;
    }

    protected void increaseHappiness(int increment) {
        happiness += increment;
    }

    public abstract void feed();

    public abstract void play(int hours);

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }
}
