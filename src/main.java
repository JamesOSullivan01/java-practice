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
        int score = 400;
        int levelCompleted = 5;
        int bonus = 100;

        if (score <= 5000 && score > 1000) {
            System.out.println("Your score was less than  5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("got here");
        }
    }
}
