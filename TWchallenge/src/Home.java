import java.util.*;

public class Home {
    private int level = 1;
    private int population = 0;
    private int floor = 0;
    private int unit = 0;
    private int unitID = 0;
    private int score = 0;
    private int gill = 0;
    private int blockID = 0;

    Home(int flr, int unt, int blckID, int untID) {
        floor = flr;
        unit = unt;
        blockID = blckID;
        unitID = untID;
    }

    public int getScore() {
        return score;
    }

    public int getGill() {
        return gill;
    }

    public int getUnitID() {
        return unitID;
    }

    public void upgradeHome() {

    }
}
