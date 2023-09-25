public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;

        if (year >= 1 && year <= 9999){
            if (year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0 ))) {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

    public static int getDaysInMonth (int month, int year) {
        if (year >= 1 && year <= 9999) {

            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    return 31;
                }
                case 4, 6, 9, 11 -> {
                    return 30;
                }
                case 2 -> {
                    if (isLeapYear(year) == true) {
                        return 29;
                    } else {
                        return 28;
                    }
                }
                default -> {
                    return -1;
                }
            }

        } else {
            return -1;
        }
    }

//    public static void main(String[] args) {
//        System.out.println(getDaysInMonth(1, 10_000));
//    }
}
