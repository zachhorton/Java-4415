package testPlayer;

/**
 * Created by zachhorton on 10/17/16.
 */
public class TestPlayer {

    public static void main(String[] args) {
        BaseballPlayer aCatcher = new BaseballPlayer(12, .218);
        BaseballPlayer aShortStop = new BaseballPlayer(31, .385);
        BaseballPlayer aPitcher = new BaseballPlayer(24, .424);

        aCatcher.showPlayer();
        aShortStop.showPlayer();
        aPitcher.showPlayer();

        BaseballPlayer aBaseman = new BaseballPlayer(07, .522);
        aBaseman.showPlayer();
        aCatcher.showPlayer();

        aCatcher.updateStats(.555);
    }
}
