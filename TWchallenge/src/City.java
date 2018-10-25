import java.util.*;

public class City {
    private int number = 0;
    private int score = 0;
    private int gill = 30000;
    private ArrayList<Block> blockArr = new ArrayList<Block>();
    private boolean attak = false;
    private int num_blocks;

    public void newBlock() {
        blockArr.add(new Block(num_blocks));
        num_blocks++;
    }

    public int dayCounter() {
        for (Block block : blockArr) {
            for (Army army : block) {
                army.setDay(army.getDay() + 1);
            }
            for (Defense defense : block) {
                defense.setDay(defense.getDay() + 1);
            }
        }
    }


    public int getScore() {
        return score;
    }

    public int getGill() {
        return gill;
    }

    public ArrayList<Block> getBlockArr() {
        return blockArr;
    }

    public void removeBlock(num_block){

    }
}
