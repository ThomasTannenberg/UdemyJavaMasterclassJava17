public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hoursOfDay){
        boolean isBarking = false;

        if (hoursOfDay < 0 || hoursOfDay > 23){
            isBarking = false;
        } else if (barking && (hoursOfDay < 8 || hoursOfDay > 22)) {
            isBarking = true;
        }
        return isBarking;
    }

//    public static void main(String[] args) {
//        System.out.println(shouldWakeUp(true, -1));
//    }
}
