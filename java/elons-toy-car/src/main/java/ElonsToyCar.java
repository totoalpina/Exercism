public class ElonsToyCar {

    private int distanceDriven;
    private int batteryPercentage;

    public ElonsToyCar() {
        distanceDriven = 0;
        batteryPercentage = 100;
    }

    public int getDistanceDriven() {
        return distanceDriven;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setDistanceDriven() {
        if (getBatteryPercentage() > 0) {
            distanceDriven += 20;
    }
    }

    public void setBatteryPercentage() {
        batteryPercentage -= 1;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        return batteryPercentage > 0 ? "Battery at " + batteryPercentage + "%" : "Battery empty";
    }

    public void drive() {
        setDistanceDriven();
        setBatteryPercentage();
    }
}
