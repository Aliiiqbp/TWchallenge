import java.util.*;

public class Block {
    private int blockID = 0;
    private int level = 0;
    private ArrayList<Home> homeArr = new ArrayList<Home>();
    private ArrayList<Bazaar> bazarArr = new ArrayList<Bazaar>();
    private ArrayList<Army> armyArr = new ArrayList<Army>();
    private ArrayList<Defense> defenseArr = new ArrayList<Defense>();
    private int num_units = 0;
    private boolean defense = false;
    private int population = 0;
    private int gill = 0;
    private  int score = 0;

    Block( int numblck){
        blockID = numblck;
    }

    public void addHome( int floor, int unit){
        num_units++;
        homeArr.add(new Home (floor, unit, blockID, num_units));
        System.out.println(num_units);
    }
    public void addBazar(){
        num_units++;
        bazarArr.add(new Bazaar(blockID, num_units));
        System.out.println(num_units);
    }
    public void addArmy(){
        num_units++;
        armyArr.add(new Army (blockID, num_units));
        System.out.println(num_units);
    }
    public void addDefense(){
        num_units++;
        defenseArr.add(new Defense (blockID, num_units));
        System.out.println(num_units);
    }
    public int getScore(){
        return score;
    }
    public int getGill(){
        return gill;
    }
    public String getType(int untId){
        for (Army army : armyArr) {
            if (army.getUnitID() == untId)
                return "Army";
        }
        for (Bazaar bazaar : bazarArr) {
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

}
