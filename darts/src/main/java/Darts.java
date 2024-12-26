class Darts {
    int score(double xOfDart, double yOfDart) {
        double distance = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));

        if (distance > 10.0)
            return 0;
        else if (distance > 5.0)
            return 1;
        else if (distance > 1.0)
            return 5;

        return 10;
    }
}
