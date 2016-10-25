package testPlayer;

/**
 * Created by zachhorton on 10/17/16.
 */
class BaseballPlayer {
    private static int count = 0;
    private int number;
    private double battingAverage;

    public BaseballPlayer (int id, double avg) {
        number = id;
        battingAverage = avg;
        count++;
    }

    void showPlayer() {
        System.out.println("Player #" + number +
        "'s batting average is " + battingAverage +
        ". There are " + count + " players.");
    }

    void updateStats(double avg) {
        battingAverage = avg;
        System.out.println("Player #" + number +
        "'s batting average has been updated to " +
        battingAverage + ".");
    }
}