public class Army {
    private int blockID;
    private int coefficiency;
    private int level;
    private int unitID;
    private int score;
    private int gill;
    private int test;
    private ArrayList<Person> personArr = new ArrayList<Person>();

    Army( int blckID, int untID){
        blockID = blckID;
        unitID = untID;
    }
    public void upgradeArmy(){

    }

    public void removeArmy(){

    }
    public int getScore(){
        return score;
    }
    public int getGill(){
        return gill;
    }

}
