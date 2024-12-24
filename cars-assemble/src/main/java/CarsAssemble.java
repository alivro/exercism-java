public class CarsAssemble {
    private static final int CARS_PRODUCED_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        double production = speed * CARS_PRODUCED_PER_HOUR;

        if(speed == 10) {
            production *= 0.77;
        }
        else if (speed == 9) {
            production *= 0.8;
        }
        else if (speed >= 5) {
            production *= 0.9;
        }

        return production;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
