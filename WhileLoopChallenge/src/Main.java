public class Main {
    public static void main(String[] args) {
        testNumbers(5, 20);
    }

    public static boolean isEvenNumber (int number) {
        return number % 2 == 0;
    }

    public static void testNumbers(int rangeStart, int rangeEnd){
        int counterEven = 0;
        int counterOdd = 0;
        while (rangeStart <= rangeEnd) {
            if (isEvenNumber(rangeStart)){
                System.out.println("This is an even number: " + rangeStart);
                counterEven++;
            }

            if (!isEvenNumber(rangeStart)){
                counterOdd++;
            }

            rangeStart++;

            if (counterEven == 5){
                System.out.println("Even Numbers found: " + counterEven);
                System.out.println("Odd Numbers found: " + counterOdd);
                break;
            }
        }
    }

}
