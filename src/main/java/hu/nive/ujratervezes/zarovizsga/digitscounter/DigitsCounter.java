package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {
    public int getCountOfDigits(String input) {
        if (input == null) {
            return 0;
        }
        Set<Character> chars = new HashSet<>();
        for (char item : input.toCharArray()) {
            if (Character.isDigit(item)) {
                chars.add(item);
            }
        }
        return chars.size();
    }
}
