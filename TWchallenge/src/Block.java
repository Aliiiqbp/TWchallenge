import java.util.ArrayList;

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

    public void addHome( int floor, int unit){
        homeArr.add(new Home (floor, unit, blockID, num_units));
        System.out.println(num_units);
        num_units++;
    }
    public void addBazar(){
        bazarArr.add(new Bazaar(blockID, num_units));
        System.out.println(num_units);
        num_units++;
    }
    public void addArmy(){
        armyArr.add(new Army (blockID, num_units));
        System.out.println(num_units);
        num_units++;
    }
    public void addDefense(){
        defenseArr.add(new Defense (blockID, num_units));
        System.out.println(num_units);
        num_units++;
    }




}
