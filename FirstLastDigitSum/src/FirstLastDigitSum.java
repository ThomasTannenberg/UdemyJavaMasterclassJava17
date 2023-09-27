public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int parameter){

        int firstDigit = 0;
        int lastDigit = parameter % 10;

        if (parameter < 0) {
            return -1;
        }

        while (parameter > 0) {
            if (parameter > 0 && parameter < 10){
                firstDigit = parameter;
            }
            parameter /= 10;
        }

        System.out.println("First Digit: " + firstDigit);
        System.out.println("Last Digit: " + lastDigit);

        return firstDigit + lastDigit;



    }

//    public static void main(String[] args) {
//       sumFirstAndLastDigit(5);
//    }
}
