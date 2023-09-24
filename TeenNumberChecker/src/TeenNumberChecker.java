public class TeenNumberChecker {
    public static boolean isTeen(int age){
        return (age >= 13 && age <= 19);
    }

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree){
        boolean isTeen = false;

        if (ageOne >= 13 && ageOne <= 19){
            isTeen = true;
        }
        if (ageTwo >= 13 && ageTwo <= 19){
            isTeen = true;
        }
        if (ageThree >= 13 && ageThree <= 19){
            isTeen = true;
        }

        return  isTeen;
    }
}
