package src;

public class methodChallenge1 {

    public static void displayHighScorePosition(String name, int playerPosition) {
        System.out.println(name + " managed to get into Position " + playerPosition + " on the highScore list");
    }

    public static int calculateHighScorePosition(int score) {

        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }

    public static void main(String[] args) {
        String name = "tim";
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition(name, highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Jim", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Bill", highScorePosition);


    }
}




