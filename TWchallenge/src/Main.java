import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        City[] tehran = new City[2];

        boolean round = false;

        while (true) {

            String command = read.nextLine();
            command = command.toLowerCase();
//End Game *_*
            if (command.equalsIgnoreCase("yield")) {
                break;
            }


//Other commands like score, gill, done, attackloot.
            if (command.equalsIgnoreCase("done")) {
                if (round == true) {
                    round = false;
                } else {
                    round = true;
                }
                continue;
            } else if (command.equalsIgnoreCase("see score")) {
                System.out.println(tehran[round].getScore());
                continue;
            } else if (command.equalsIgnoreCase("see gills")) {
                System.out.println(tehran[round].getGill());
                continue;
            } else if (command.matches("attack \\d")) {

                continue;
            } else if (command.matches("Loot \\d")) {

                continue;
            }


//Add & Upgrade home
            if (command.matches("add home [B.id] [numberOfFloor] [NumberOfUnit]")) {


                continue;
            } else if (command.matches("upgrade [B.id] [U.id] (floor || unit)")) {


                continue;
            }


//Add, Remove, Upgrade Block.
            if (command.equalsIgnoreCase("add block")) {
                tehran[round].newBlock();
                continue;
            } else if (command.matches("remove \\d")) {
                tehran[round]. // remove block
                continue;
            } else if (command.matches("upgrade \\d")) {
                tehran[round]. // upgrade block
                continue;
            }


//Add Bazaar, Army ,Defense
            if (command.matches("add bazar \\d")) {

                continue;
            } else if (command.matches("add army \\d")) {


                continue;
            } else if (command.matches("add defense \\d")) {

                continue;
            }


//Upgrade [B.id][U,id]
            if (command.matches("upgrade \\d \\d")) {

                //army, defense, bazaar getType()

                continue;
            } else if (command.matches("remove [B.id] [U.id]")) {

                //army, defense, bazaar getType()

                continue;
            }


        }
    }


}
