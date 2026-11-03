package week02;

public class ScoreStats {

    static int findHighest(int[] scores) {

        int highest = scores[0];

        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }

        return highest;
    }

    public static void main(String[] args) {
        int[] scores = {85, 92, 70};

        int highestScore = findHighest(scores);

        System.out.println("Highest score: " + highestScore);
    }
}