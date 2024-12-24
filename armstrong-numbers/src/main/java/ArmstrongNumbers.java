import java.util.Arrays;

class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) {
        String[] stringNumber = String.valueOf(numberToCheck).split("");

        return numberToCheck == Arrays.stream(stringNumber)
                .mapToInt(Integer::valueOf)
                .mapToDouble(n -> Math.pow(n, stringNumber.length))
                .sum();
    }
}
