public class Challenge {
    public static void main(String[] args){
        double variableOne = 20.00d;
        double variableTwo = 80.00d;

        double result = (variableOne + variableTwo) * 100d;

        System.out.println("Remainder: " + (result % 40.00d));

        boolean isRemainderZero = result % 40.00d == 0.0 ? true : false;

        System.out.println(isRemainderZero);

        if (!isRemainderZero) {
            System.out.println("got some remainder");
        }

    }
}
