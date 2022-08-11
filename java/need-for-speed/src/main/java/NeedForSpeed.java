class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int totalDistance;
    private int batteryPercentage;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        batteryPercentage = 100;
        totalDistance = 0;
    }

    public int getSpeed() {
        return this.speed;
    }


    public int getBatteryDrain() {
        return this.batteryDrain;
    }

    public void setTotalDistance() {
        if (batteryPercentage >= batteryDrain) {
            totalDistance += speed;
        }
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public void setBatteryPercentage() {
        batteryPercentage -= batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }

    public int distanceDriven() {
        return totalDistance;
    }

    public void drive() {
        if (!batteryDrained()) {
            setTotalDistance();
            setBatteryPercentage();
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        double numberOfDrivesToFinish = (double)distance / (double) car.getSpeed();
        if (100 -  numberOfDrivesToFinish * car.getBatteryDrain() >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
