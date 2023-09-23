public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finaleScore = score;

        if (gameOver) {
            finaleScore += (levelCompleted * bonus);
            System.out.println("Your final score was: " + finaleScore);
        }

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;
        finaleScore = score;

        if (gameOver) {
            finaleScore += levelCompleted * bonus;
            System.out.println("Your final score was: " + finaleScore);
        }
    }
}