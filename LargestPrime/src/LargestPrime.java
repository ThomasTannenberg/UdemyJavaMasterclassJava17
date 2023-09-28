public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }


        while (number % 2 == 0) {
            number /= 2;
        }
        if (number == 1) {
            return 2;
        }

        int largestPrime = -1;


        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }


        if (number > 2) {
            return number;
        }

        return largestPrime;
    }
}
