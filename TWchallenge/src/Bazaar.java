import java.util.*;

public class Bazaar {
    private int blockID;
    private int level = 1;
    private int unitID;
    private ArrayList<Person> personArr = new ArrayList<Person>();
    private int day;
    private double coefficiency = 1.0;
    private int employee;
    private int score;

    Bazaar(int blckID, int untID) {
        blockID = blckID;
        unitID = untID;
    }

    public void upgradeBazaar() {

    }

    public int getScore() {
        return score;
    }

    public int getUnitID() {
        return unitID;
    }

    public int getEmployee() {
        return employee;
    }

    public void setPersonArr(ArrayList<Person> personArr) {
        this.personArr = personArr;
    }

    public ArrayList<Person> getPersonArr() {
        return personArr;
    }
    //    public int gillCalc(){
//        int toAdd;
//        for (Person person : personArr) {
//             personArr;
//        }
//
//    }

}

