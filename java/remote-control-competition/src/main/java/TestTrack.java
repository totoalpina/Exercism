import java.util.ArrayList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        List<ProductionRemoteControlCar> rankedCars = new ArrayList<>(cars);
        rankedCars.sort((car1, car2) -> car1.compareTo(car2));
        return rankedCars;
    }
}
