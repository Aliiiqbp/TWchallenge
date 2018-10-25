import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        City[] tehran = new City[2];

        int round = 0;

        while (true) {

            String command = read.nextLine();
            command = command.toLowerCase();

            String[] commandSplitted = new String[5];
            commandSplitted = command.split(" ");
            int blockID = 0;
            int unitID = 0;
//End Game *_*
            if (command.equalsIgnoreCase("yield")) {
                break;
            }


//Other commands like score, gill, done, attackloot.
            if (command.equalsIgnoreCase("done")) {
                if (round == 1) {
                    round = 0;
                } else {
                    round = 1;
                }
                continue;
            } else if (command.equalsIgnoreCase("see score")) {
                System.out.println(tehran[round].getScore());
                continue;
            } else if (command.equalsIgnoreCase("see gills")) {
                System.out.println(tehran[round].getGill());
                continue;
            } else if (command.matches("attack [\\d+]")) {

                continue;
            } else if (command.matches("Loot [\\d+]")) {

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
            } else if (command.matches("remove [\\d+]")) {

                blockID = Integer.parseInt(commandSplitted[1]);
                tehran[round].getBlockArr().get(blockID)./////////////////////////remove
                continue;
            } else if (command.matches("upgrade [\\d+]")) {

                blockID = Integer.parseInt(commandSplitted[1])
                tehran[round].getBlockArr().get(blockID).//////////////////////////upgrade
                continue;
            }


//Add Bazaar, Army ,Defense
            if (command.matches("add bazar \\d")) {

                blockID = Integer.parseInt(commandSplitted[1]);
                tehran[round].getBlockArr().get(blockID).addbazaar();
                continue;
            } else if (command.matches("add army \\d")) {

                blockID = Integer.parseInt(commandSplitted[1]);
                tehran[round].getBlockArr().get(blockID).addArmy();
                continue;
            } else if (command.matches("add defense \\d")) {

                blockID = Integer.parseInt(commandSplitted[1]);
                tehran[round].getBlockArr().get(blockID).addDefense();
                continue;
            }


//Upgrade [B.id][U,id]
            if (command.matches("upgrade \\d \\d")) {

                blockID = Integer.parseInt(commandSplitted[1]);
                unitID = Integer.parseInt(commandSplitted[2]);

                switch (tehran[round].getBlockArr().get(blockID).getType(unitID)) {

                    case "Army":
                        tehran[round].getBlockArr().get(blockID).upgradeArmy(unitID);
                        break;
                    case "Bazaar":
                        tehran[round].getBlockArr().get(blockID).upgradeBazaar(unitID);
                        break;
                    case "Home":
                        tehran[round].getBlockArr().get(blockID).upgradeHome(unitID);
                        break;
                    case "Defence":
                        tehran[round].getBlockArr().get(blockID).upgradeDefence(unitID);
                        break;
                    default:
                        System.out.println("not possible");
                }

                continue;


            } else if (command.matches("remove [B.id] [U.id]")) {

                //army, defense, bazaar getType()

                continue;
            }
        }
    }
}
