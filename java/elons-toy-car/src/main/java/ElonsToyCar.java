public class ElonsToyCar {

    private int distanceDriven;
    private int batteryPercentage;

    public ElonsToyCar() {
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }

    public int getDistanceDriven() {
        return this.distanceDriven;
    }

    public int getBatteryPercentage() {
        return this.batteryPercentage;
    }

    public void setDistanceDriven() {
        if (getBatteryPercentage() > 0) {
            this.distanceDriven += 20;
        } else {
            this.distanceDriven += 0;
        }
    }

    public void setBatteryPercentage() {
        this.batteryPercentage -= 1;
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
