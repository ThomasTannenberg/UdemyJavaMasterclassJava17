public class NumberPalindrome {
    public static boolean isPalindrome (int parameter){
        int reverse = 0;
        int originalNumber = parameter;

        if (parameter < 0){
            parameter *= -1;
            originalNumber *= -1;
        }

        while (parameter > 0){
            int lastDigit = 0;

            lastDigit = parameter % 10;
            System.out.println("Last Digit is: " + lastDigit);

            reverse = reverse * 10 + lastDigit;

            System.out.println("Reverse Number: " + reverse);

            parameter /= 10;

        }

        System.out.println("Parameter was: " + originalNumber);
        return originalNumber == reverse;
    }
//    public static void main(String[] args) {
//       isPalindrome(-222);
//    }
}
