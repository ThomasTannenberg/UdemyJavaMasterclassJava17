import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = 0;
        int counter = 1;
        double sum = 0;

        do {
            try {
                System.out.println("Enter number #" + counter);
                String userInput = scan.nextLine();
                number = Double.valueOf(userInput);
                sum += number;
                counter++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number");
            }
        } while (counter <= 5);

        System.out.println("The sum of the five numbers: " + sum);
    }
}
