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
            if (command.equalsIgnoreCase("Yield")) {
                break;
            }


//Other commands like score, gill, done, attackloot.
            if (command.equalsIgnoreCase("Done")) {
                if (round == true) {
                    round = false;
                } else {
                    round = true;
                }
                continue;
            } else if (command.equalsIgnoreCase("See Score")) {
                System.out.println(tehran[round].getScore());
                continue;
            } else if (command.equalsIgnoreCase("See Gills")) {
                System.out.println(tehran[round].getGill());
                continue;
            } else if (command.matches("attack \\d")) {

                continue;
            } else if (command.matches("Loot \\d")) {

                continue;
            }


//Add & Upgrade home
            if (command.equalsIgnoreCase("Add Home [B.id] [numberOfFloor] [NumberOfUnit]")) {


                continue;
            } else if (command.equalsIgnoreCase("Upgrade [B.id] [U.id] (floor || unit)")) {


                continue;
            }


//Add, Remove, Upgrade Block.
            if (command.equalsIgnoreCase("Add Block")) {

                continue;
            } else if (command.equalsIgnoreCase("Remove [B.id]")) {

                continue;
            } else if (command.equalsIgnoreCase("Upgrade [B.id]")) {

                continue;
            }


//Add Bazaar, Army ,Defense
            if (command.equalsIgnoreCase("Add Bazar [B.id]")) {

                continue;
            } else if (command.equalsIgnoreCase("Add Army [B.id]")) {

                continue;
            } else if (command.equalsIgnoreCase("Add Defense [B.id]")) {

                continue;
            }


//Upgrade [B.id][U,id]
            if (command.equalsIgnoreCase("upgrade [B.id] [U.id]")) {

                //army, defense, bazaar getType()

                continue;
            } else if (command.equalsIgnoreCase("remove [B.id] [U.id]")) {

                //army, defense, bazaar getType()

                continue;
            }


        }
    }


}
