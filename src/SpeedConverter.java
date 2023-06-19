package src;

public class SpeedConverter {

    public static void main(String[] args) {
        double kilometersPerHour = 75.5;
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        printConversion(kilometersPerHour, milesPerHour);

        kilometersPerHour = -5.6;
        milesPerHour = toMilesPerHour(kilometersPerHour);
        printConversion(kilometersPerHour, milesPerHour);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double milesPerHour = kilometersPerHour / 1.609;
            return Math.round(milesPerHour);
        }
    }

    public static void printConversion(double kilometersPerHour, long milesPerHour) {
        if (milesPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
