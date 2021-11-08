package RealHomework.Tema12;

import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.MILLIS;

public class StopWatch {
    //private LocalTime startTime;
    //private LocalTime endTime;
    private long startTime = System.currentTimeMillis();
    private long endTime = -1;

    public StopWatch() {}

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() throws Exception {
        if (endTime != -1)
            return endTime - startTime;
        else
            throw new Exception("The stopwatch hasn't stopped yet.");
    }
}
