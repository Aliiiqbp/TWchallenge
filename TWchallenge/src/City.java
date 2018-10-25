import java.util.ArrayList;

public class City {
    private int number = 0;
    private int score = 0;
    private int gill = 0;
    private ArrayList<Block> blockArr = new ArrayList<Block>();
    private boolean attak = false;
    private int num_blocks;

    public void newBlock(){
        blockArr.add(new Block (num_blocks));
        num_blocks++;
    }

    public int getScore() {
        return score;
    }

    public int getGill() {
        return gill;
    }
}
