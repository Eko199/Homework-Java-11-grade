package random.Ma2;

public class Kids extends Movie {
    private int series;
    private int breakingTime;

    public Kids(double duration, int size, boolean oscar, int series, int breakingTime) {
        super(duration, size);
        this.series = series;
        this.breakingTime = breakingTime;
    }

    public int getBreakingTime() {
        return breakingTime;
    }
}
