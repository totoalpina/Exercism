import java.util.Arrays;
import java.util.stream.Stream;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if (birdsPerDay.length < 1) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        return Stream.of(birdsPerDay)
            .flatMapToInt(Arrays::stream)
            .anyMatch(n -> n == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > birdsPerDay.length) {
            return Stream.of(birdsPerDay)
                    .flatMapToInt(Arrays::stream)
                    .reduce(0, Integer::sum);
        }
        
        return Stream.of(birdsPerDay)
                .flatMapToInt(Arrays::stream)
                .limit(numberOfDays)
                .reduce(0, (x, y) -> x + y);
    }

    public int getBusyDays() {
        int count = 0;
        for (int day : birdsPerDay) {
            if (day >= 5){
                count++;
            }
        }
        return count;
    }
}
