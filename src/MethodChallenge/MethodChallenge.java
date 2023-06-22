package MethodChallenge;

public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Tim",
                calculateHighScorePosition(1500));

        displayHighScorePosition("Jim",
                calculateHighScorePosition(1000));

        displayHighScorePosition("John",
                calculateHighScorePosition(500));

        displayHighScorePosition("Jack",
                calculateHighScorePosition(100));

        displayHighScorePosition("Erik",
                calculateHighScorePosition(25));


    }

    public static void displayHighScorePosition(String playerName, int playerHighScoreList) {
        System.out.println(playerName + " managed to get into position " +
                playerHighScoreList + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
