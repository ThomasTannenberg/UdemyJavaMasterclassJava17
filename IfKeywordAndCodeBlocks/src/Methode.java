public class Methode {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your highScore is: " + highScore);

        System.out.println("The next highScore is: "
                + calculateScore(true, 10_000, 8, 200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finaleScore = score;

        if (gameOver) {
            finaleScore += (levelCompleted * bonus);
            finaleScore += 1_000;
            //System.out.println("Your final score was: " + finaleScore);
        }

        return finaleScore;

    }

}