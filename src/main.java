package src;

public class main {
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

        boolean gameOVer = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if (gameOVer == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }
    }
}
