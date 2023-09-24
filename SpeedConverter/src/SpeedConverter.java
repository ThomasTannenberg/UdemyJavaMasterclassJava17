public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        long mph = 1L;

        if (kilometersPerHour < 0) {
            mph = -1L;
        } else {
            mph = Math.round(kilometersPerHour / 1.609);
        }
        return mph;
    }

    public static void printConversion(double kilometersPerHours){
        long milesPerHour = toMilesPerHour(kilometersPerHours);

        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHours
                                + " km/h = "
                                + milesPerHour
                                + " mi/h");
        }
    }
}
