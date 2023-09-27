public class EvenDigitSum {
    public static int getEvenDigitSum (int number){
        int sum = 0;
        int digit = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 0){
            digit = number % 10;
            if (digit % 2 == 0){
                sum += digit;
                System.out.println("positive digit is: " + digit);
            }
            number /= 10;

        }
        System.out.println("The sum is: " + sum);
        return sum;
    }

//    public static void main(String[] args) {
//        getEvenDigitSum(123456789);
//    }
}
