public class Testing {
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

       System.out.println("1st return value is : "+ calculateScore(gameOver,score,levelCompleted,bonus,finalScore));
        score=10000;
        levelCompleted=8;
        bonus=200;
        System.out.println("2nd return value is : "+calculateScore(gameOver,score,levelCompleted,bonus,finalScore));


    }

    public static int  calculateScore(boolean gameOver, int score,int levelCompleted, int bonus, int finalScore )
    {
        if (gameOver)
        {

            finalScore = finalScore + (levelCompleted*bonus);
            System.out.println(" Your final score is - "+ finalScore);
        }
        return finalScore;

    }

}
