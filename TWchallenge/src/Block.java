import java.util.*;

public class Block {
    private int blockID = 0;
    private int level = 1;
    private int capacity = 15;
    private ArrayList<Home> homeArr = new ArrayList<Home>();
    private ArrayList<Bazaar> bazaarArr = new ArrayList<Bazaar>();
    private ArrayList<Army> armyArr = new ArrayList<Army>();
    private ArrayList<Defense> defenseArr = new ArrayList<Defense>();
    private int num_units = 0;
    private boolean defense = false;
    private int population = 0;
    private int unemployment = 0;
    //    private int gill = 0;
    private int score = 0;

    Block(int numblck) {
        blockID = numblck;
    }

    public void addHome(int floor, int unit) {
        num_units++;
        homeArr.add(new Home(floor, unit, blockID, num_units));
        System.out.println(num_units);
        unemployment = floor * unit * 5;
    }

    public boolean addBazaar() {
        num_units++;
        if (unemployment < 50)
            return false;
        int counter = 0;
        Bazaar bazaar = new Bazaar(blockID, num_units);
        bazaarArr.add(bazaar);
        for (Home home : homeArr) {
            for (Person person : home.getPersonArr()) {
                if (!person.getisEmp()) {
                    person.setEmp(true);
                    unemployment--;
                    bazaar.getPersonArr().add(person);
                    counter++;
                    if (counter == 50) {
                        return true;
                    }
                }
            }
        }
        System.out.println(num_units);
        return true;
    }

    public void removeBazaar(int blckID, int untID) {
        blockID = blckID;
        num_units--;
        int counter = 0;
        Bazaar bazaar = getBazaarByID(untID);
        if (bazaar != null) {
            bazaarArr.remove(bazaar);
            for (Person person : bazaar.getPersonArr()) {
                person.setEmp(true);
                unemployment--;
            }
        }
    }

    private Bazaar getBazaarByID(int untId) {
        for (Bazaar bazaar : bazaarArr) {
            if (bazaar.getUnitID() == untId)
                return bazaar;
        }
        return null;
    }

    public boolean addArmy() {
        num_units++;
        if (unemployment < 100)
            return false;
        int counter = 0;
        Army army = new Army(blockID, num_units);
        armyArr.add(army);
        for (Home home : homeArr) {
            for (Person person : home.getPersonArr()) {
                if (!person.getisEmp()) {
                    person.setEmp(true);
                    unemployment--;
                    army.getPersonArr().add(person);
                    counter++;
                    if (counter == 100) {
                        return true;
                    }
                }
            }
        }
        System.out.println(num_units);
        return true;
    }

    private Army getArmyByID(int untId) {
        for (Army army : armyArr) {
            if (army.getUnitID() == untId)
                return army;
        }
        return null;
    }

    public void addDefense() {
        num_units++;
        defenseArr.add(new Defense(blockID, num_units));
        System.out.println(num_units);
    }

    public int getScore() {
        return score;
    }

//    public int getGill() {
//        return gill;
//    }

    public String getType(int untId) {
        for (Army army : armyArr) {
            if (army.getUnitID() == untId)
                return "Army";
        }
        for (Bazaar bazaar : bazaarArr) {
            if (bazaar.getUnitID() == untId)
                return "Bazaar";
        }
        for (Home home : homeArr) {
            if (home.getUnitID() == untId)
                return "Home";
        }
        for (Defense defence : defenseArr) {
            if (defence.getUnitID() == untId)
                return "Defence";
        }
        return "NotFound";
    }

    public ArrayList<Army> getArmyArr() {
        return armyArr;
    }

    public ArrayList<Defense> getDefenseArr() {
        return defenseArr;
    }

    public ArrayList<Bazaar> getBazaarArr() {
        return bazaarArr;
    }

    public ArrayList<Home> getHomeArr() {
        return homeArr;
    }

//    public int gillCalc(){
//        int addGill = 0;
//        int employments = 0;
//        for (Defense defence : defenseArr) {
//            employments += defence.getDefenders()
//        }
//        for (Army army : armyArr) {
//            employments += army.getSoldiers();
//        }
//        for (Bazaar bazaar : bazaarArr) {
//            employments += bazaar.getEmployee();
//        }
//        int unemployment = population - employments;
//
//    }

}
