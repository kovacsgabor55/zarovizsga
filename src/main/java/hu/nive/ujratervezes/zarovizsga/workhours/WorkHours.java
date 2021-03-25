package hu.nive.ujratervezes.zarovizsga.workhours;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkHours {
    private final List<Worker> workers = new ArrayList<>();

    public String minWork(String fileName) {
        Path path = Path.of(fileName);
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                createAndAddWorker(line);
            }
            return getMinWorkTimeWorker();
        } catch (IOException e) {
            throw new IllegalArgumentException("File not fount! file name: " + fileName, e);
        }
    }

    private void createAndAddWorker(@NotNull String line) {
        String[] parts = line.split(",");
        String name = parts[0];
        int workHour = Integer.parseInt(parts[1]);
        LocalDate workDay = LocalDate.parse(parts[2]);
        workers.add(new Worker(name, workHour, workDay));
    }

    private String getMinWorkTimeWorker() {
        return Collections.min(workers, new Worker.WorkHourComparator()).getNameAndWorkDayString();
    }
}
