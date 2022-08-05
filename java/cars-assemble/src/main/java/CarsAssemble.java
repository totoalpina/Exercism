public class CarsAssemble {

    private final int carPerHour = 221;

    public double productionRatePerHour(int speed) {
        return switch(speed) {
            case 5,6,7,8 ->
                speed * carPerHour * 0.9;
            case 9 ->
                speed * carPerHour * 0.8;
            case 10 ->
                speed * carPerHour * 0.77;
            default -> speed * carPerHour;
        };
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60) ;
    }
}
