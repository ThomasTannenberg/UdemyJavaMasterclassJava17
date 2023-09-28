import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        long avg = 0L;
        int counter = 0;

        while (true) {
            try {
                String userInput = scan.nextLine();
                int number = Integer.valueOf(userInput);
                counter++;
                sum += number;
                avg = Math.round((double) sum / counter);

            } catch (NumberFormatException e) {
                break;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);

    }

//    public static void main(String[] args) {
//        inputThenPrintSumAndAverage();
//    }
}
