import java.util.*;

public class Bazaar {
    private int blockID;
    private int level;
    private int unitID;
    private ArrayList<Person> personArr = new ArrayList<Person>();
    private int day;
    private int coefficiency;
    private int employee;
    private int score;
    private int gill;

    Bazaar(int blckID, int untID) {
        blockID = blckID;
        unitID = untID;
    }

    public void upgradeBazaar() {

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
}
