public class PerfectNumber {
    public static boolean isPerfectNumber (int number) {
        int sum = 0;

        if (number < 1) {
            return  false;
        }

        for (int i = 1; i <= (number / 2); i++){
            if (number % i == 0){
                sum += i;
            }
        }

        return sum == number;
    }

//    public static void main(String[] args) {
//        System.out.println(isPerfectNumber(28));
//    }
}


