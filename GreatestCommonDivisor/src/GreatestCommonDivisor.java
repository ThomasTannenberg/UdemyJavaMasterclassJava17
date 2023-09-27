public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int first, int second) {
        int highestDividor = 0;

        if ((first < 10) || (second < 10)) {
            return -1;
        }

        for (int i = 1; i <= first; i++ ) {
            int dividorFirst = 0;
            int dividorSecond = 0;

            if (first % i == 0){
                dividorFirst = i;
            }

            for (int j = 1; j <= second; j++){
                if (second % j == 0){
                    dividorSecond = j;
                    if (dividorFirst == dividorSecond){
                        highestDividor = dividorFirst;
                    }
                }
            }
        }
        return highestDividor;
    }

//    public static void main(String[] args) {
//        System.out.println(getGreatestCommonDivisor(81, 153));
//    }
}
