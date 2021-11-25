package RealHomework.Tema12;

public class StopWatch {
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
