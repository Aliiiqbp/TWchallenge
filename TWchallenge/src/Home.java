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
    private ArrayList<Person> personArr = new ArrayList<Person>();

    Home(int flr, int unt, int blckID, int untID) {
        floor = flr;
        unit = unt;
        blockID = blckID;
        unitID = untID;
        for ( int i = 0 ; i < 5*floor*unit ; i++){
            personArr.add(new Person());
        }


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

    public ArrayList<Person> getPersonArr() {
        return personArr;
    }
}
