package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Kennel {
    private List<Dog> dogs = new ArrayList<>();

    public List<Dog> getDogs() {
        return new ArrayList<>(dogs);
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void feedAll() {
        for (Dog item : dogs) {
            item.feed();
        }
    }

    public Dog findByName(String name) {
        Dog result = null;
        for (Dog item : dogs) {
            if (item.name.equals(name)) {
                result = item;
            }
        }
        if (Objects.isNull(result)) {
            throw new IllegalArgumentException("Cannot find dog: " + name);
        }
        return result;
    }

    public void playWith(String name, int hours) {
        findByName(name).play(hours);
    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> result = new ArrayList<>();
        for (Dog item : dogs) {
            if (item.getHappiness() > minHappiness) {
                result.add(item.getName());
            }
        }
        return result;
    }
}
