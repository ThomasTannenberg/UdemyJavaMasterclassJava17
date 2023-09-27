public class SharedDigit {
    public static boolean hasSharedDigit (int number1, int number2) {
        int number1digit1 = 0;
        int number1digit2 = 0;
        int number2digit1 = 0;
        int number2digit2 = 0;

        if (number1 > 99 || number1 < 10 || number2 > 99 || number2 < 10) {
            return false;
        }

        number1digit1 = number1 % 10;
        number1digit2 = (number1 / 10) % 10;
        System.out.println("Number1 in digits: " + number1digit1 + number1digit2);

        number2digit1 = number2 % 10;
        number2digit2 = (number2 / 10) % 10;
        System.out.println("Number2 in digits: " + number2digit1 + number2digit2);

        if (number1digit1 == number2digit1 || number1digit1 == number2digit2 || number1digit2 == number2digit1 || number1digit2 == number2digit2) {
            return true;
        }

        return false;
    }

//    public static void main(String[] args) {
//        hasSharedDigit(12, 23);
//    }

}
