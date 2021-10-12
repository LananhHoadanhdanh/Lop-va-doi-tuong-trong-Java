package stopWatch;
import java.lang.*;
public class StopWatch {
    public long startTime, endTime;
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;

    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void end() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
