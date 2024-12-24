import java.util.Random;

class CaptainsLog {
    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
    private static final int STARSHIP = 1000;
    private static final int STARDATE = 41000;

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        return "NCC-" + (STARSHIP + random.nextInt(9000));
    }

    double randomStardate() {
        return STARDATE + (1000 * random.nextDouble());
    }
}
