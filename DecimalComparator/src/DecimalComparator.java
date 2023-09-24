public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        boolean areEqual = false;

         if ((int) (numberOne * 1000) == (int) (numberTwo * 1000)) {
             areEqual = true;
         }

        return areEqual;
    }

//    public static void main(String[] args) {
//        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
//    }

}


