import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);


        while (true){

            String command = read.nextLine();

//End Game *_*
            if (command.equalsIgnoreCase("Yield")){
                break;
            }


//Other commands like score, gill, done, attackloot.
            if (command.equalsIgnoreCase("Done")){

                continue;
            }   else if (command.equalsIgnoreCase("See Score")){

               continue;
            }   else if (command.equalsIgnoreCase("See Gills")){

                continue;
            }   else if (command.equalsIgnoreCase("Attack [B.id]")){

                continue;
            }   else if (command.equalsIgnoreCase("Loot [B.id]")){

                continue;
            }



//Add & Upgrade home
            if (command.equalsIgnoreCase("Add Home [B.id] [numberOfFloor] [NumberOfUnit]")){

                continue;
            }   else if (command.equalsIgnoreCase("Upgrade [B.id] [U.id] (floor || unit)")){

                continue;
            }


//Add, Remove, Upgrade Block.
            if (command.equalsIgnoreCase("Add Block")){

                continue;
            }   else if (command.equalsIgnoreCase("Remove [B.id]")){

                continue;
            }   else if(command.equalsIgnoreCase("Upgrade [B.id]")){

                continue;
            }


//Add, Remove, Upgrade
            if (command.equalsIgnoreCase("Add Bazar [B.id]")){

                continue;
            }   else if(command.equalsIgnoreCase("Upgrade [B.id] [U.id]")){

                continue;
            }   else if (command.equalsIgnoreCase("remove"))


        }









        }




}
