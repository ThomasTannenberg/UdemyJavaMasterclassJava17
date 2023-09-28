import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int minNumber = 0;
        int maxNumber = 0;
        int counter = 0;

        while (true) {
            try {
                System.out.println("Please enter a number. Enter anything else to quit.");
                String userInput = scan.nextLine();
                int number = Integer.valueOf(userInput);

                if (counter == 0) {
                    maxNumber = number;
                    minNumber = number;
                }

                counter++;

                if (number > maxNumber) {
                    maxNumber = number;
                }

                if (number < minNumber) {
                    minNumber = number;
                }

            } catch (NumberFormatException e) {
                System.out.println("Exiting...");
                break;
            }
        }

        System.out.println("You entered " + counter + " numbers.");
        System.out.println("The maximum number entered is: " + maxNumber);
        System.out.println("The minimum number entered is: " + minNumber);

    }
}
