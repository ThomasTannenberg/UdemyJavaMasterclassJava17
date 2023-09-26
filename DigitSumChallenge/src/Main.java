public class Main {
    public static void main(String[] args) {
        sumDigits(1000);
    }

    public static int sumDigits(int number){
        int sum = 0;
        int digit = 0;
        int initialNumber = number;

        if (number > 0){
            while (number > 0){
                digit = number % 10;
                System.out.print(digit + "+");
                sum += digit;
                number /= 10;
            }

            System.out.println(" The sum of " + initialNumber + " = " + sum);
            return sum;
        }
        return -1;
    }
}
