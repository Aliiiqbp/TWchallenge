import java.util.*;

public class Army {
    private int blockID;
    private int level = 1;
    private double coefficiency = 0.2;
    private int unitID;
    private int score;
    private int day = 0;
    private int soldiers = 0;
    private ArrayList<Person> personArr = new ArrayList<Person>();

    Army(int blckID, int untID) {
        blockID = blckID;
        unitID = untID;
    }

    public void upgradeArmy() {

    }

    public int getScore() {
        return score;
    }

    public int getUnitID() {
        return unitID;
    }
}
