public class Main {

    public static void main(String[] args) {
        int day = 5;
        System.out.println("Day " + day + " is " + printDayOfWeek(day));
    }

    public static String printDayOfWeek (int day) {
        return switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
    }
}
