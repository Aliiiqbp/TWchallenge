import java.util.*;

public class Army {
    private int blockID;
    private int level = 1;
    private double coefficiency = 0.2;
    private int unitID;
    private ArrayList<Person> personArr = new ArrayList<Person>();
    private int score;
    private int day = 0;
    private int soldiers = 0;

    Army(int blckID, int untID) {
        blockID = blckID;
        unitID = untID;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void upgradeArmy() {

    }

    public int getScore() {
        return score;
    }

    public int getUnitID() {
        return unitID;
    }

    public int getSoldiers() {
        return soldiers;
    }

    public void setPersonArr(ArrayList<Person> personArr) {
        this.personArr = personArr;
    }

    public ArrayList<Person> getPersonArr() {
        return personArr;
    }
}
