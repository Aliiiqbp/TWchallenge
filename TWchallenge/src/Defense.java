import java.util.*;

public class Defense {
    private int blockID = 0;
    private int level = 1;
    private int unitID = 0;
    private int score;
    private double coefficiency = 0.2;


    Defense(int blckId, int untId) {
        blockID = blckId;
        unitID = untId;
    }

    public void upgradeDefense() {

    }

    public int getUnitID() {
        return unitID;
    }

    public int getScore() {
        return score;
    }
}
