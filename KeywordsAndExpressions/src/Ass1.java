public class Ass1 {
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    public static int caclulateHighScorePosition(int score) {
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
        int rank;

        rank = caclulateHighScorePosition(1500);
        displayHighScorePosition("Abhay", rank);

        rank = caclulateHighScorePosition(999);
        displayHighScorePosition("Rohit", rank);

        rank = caclulateHighScorePosition(499);
        displayHighScorePosition("Ajay", rank);

        rank = caclulateHighScorePosition(99);
        displayHighScorePosition("Atul", rank);

        rank = caclulateHighScorePosition(-1000);
        displayHighScorePosition("Sourabh", rank);

    }
}
