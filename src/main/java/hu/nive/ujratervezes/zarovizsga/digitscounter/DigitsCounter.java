package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.Objects;

public class DigitsCounter {
    public int getCountOfDigits(String input) {
        int counter = 0;
        if (!Objects.isNull(input)) {
            for (int i = 0; i <= 9; i++) {
                if (input.contains("" + i)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
