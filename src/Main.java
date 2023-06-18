package src;

public class Main {
    static boolean gameOver = true;
    static int score = 10000;
    static int levelCompleted = 8;
    static int bonus = 200;

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }
    }

    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int highScore = 50;
        if (highScore > 25) {
            highScore = 1000 + highScore;
        }
        int health = 100;
        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }

        int myVariable = 50;
        // semicolon makes it a statement
        myVariable++;
        myVariable--;

        System.out.println("This is a test");
        if (myVariable == 0) {
            System.out.println("It's now zero");
        }

        calculateScore(gameOver, score, levelCompleted, bonus);
    }
}
