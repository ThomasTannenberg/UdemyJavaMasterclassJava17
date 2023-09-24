public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;

        if (year >= 1 && year <= 9999){
            if (year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0 ))) {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

//    public static void main(String[] args) {
//        System.out.println(isLeapYear(2000));
//    }
}
