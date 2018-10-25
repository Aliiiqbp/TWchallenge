import java.util.*;

public class Defense {
    private int blockID = 0;
    private int level = 1;
    private int unitID = 0;
    private int score;
    private int day = 0;
    private double coefficiency = 0.2;


    Defense(int blckId, int untId) {
        blockID = blckId;
        unitID = untId;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
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
