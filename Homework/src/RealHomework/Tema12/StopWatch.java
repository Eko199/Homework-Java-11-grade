package RealHomework.Tema12;

import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.MILLIS;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        startTime = LocalTime.now();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = LocalTime.now();
    }

    public void stop() {
        endTime = LocalTime.now();
    }

    public long getElapsedTime() throws Exception {
        if (endTime != null)
            return MILLIS.between(startTime, endTime);
        else
            throw new Exception("The stopwatch hasn't stopped yet.");
    }
}
