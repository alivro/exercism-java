class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int remainingBattery;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        distanceDriven = 0;
        remainingBattery = 100;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public boolean batteryDrained() {
        return remainingBattery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            remainingBattery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        double movements = Math.ceil((double) distance / car.getSpeed());

        return movements * car.getBatteryDrain() <= 100;
    }
}
