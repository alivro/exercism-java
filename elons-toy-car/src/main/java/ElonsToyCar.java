public class ElonsToyCar {
    private int totalDistance;
    private int batteryCharge;

    public ElonsToyCar(){
        totalDistance = 0;
        batteryCharge = 100;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + totalDistance + " meters";
    }

    public String batteryDisplay() {
        if (batteryCharge > 0 )
            return "Battery at " + batteryCharge + "%";

        return "Battery empty";
    }

    public void drive() {
        if (batteryCharge > 0 ) {
            totalDistance += 20;
            batteryCharge -= 1;
        }
    }
}
