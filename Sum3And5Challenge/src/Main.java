public class Main {
    public static void main(String[] args) {

        int sumNumbers = 0;
        int counter = 0;

        for (int i = 1; i <= 1000; i++) {
            if (counter == 5) {
                break;
            }

            if (isDevisibleBy3and5(i) == true){
                sumNumbers += i;
                counter++;
                System.out.println(i + " can be divided by both 3 and 5");
            }
        }

        System.out.println("The sum of the numbers is " + sumNumbers);

    }

    public static boolean isDevisibleBy3and5(int number){
        if (number % 3 == 0 && number % 5 == 0){
            return true;
        }
        return false;
    }
}
