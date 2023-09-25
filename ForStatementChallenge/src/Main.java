public class Main {
    public static void main(String[] args) {

        int primeCounter = 1;
        for (int i = 10; i <= 50; i++){
            if (isPrime(i) == true && primeCounter <= 3){
                System.out.println(i);
                primeCounter++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
