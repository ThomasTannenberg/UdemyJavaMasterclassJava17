public class Main {
    public static void main(String[] args) {
        char letter = 'E';
        System.out.println(letter + " is " + checkNATOPhoneticAlphabet(letter) + " in the NATO Alphabet");
    }

    public static String checkNATOPhoneticAlphabet(char letter) {

        switch (letter) {
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "Invalid Input";
        }
    }
}
