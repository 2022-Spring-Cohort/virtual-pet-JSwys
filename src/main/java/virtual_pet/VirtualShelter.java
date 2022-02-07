package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualShelter {

    ArrayList<Pet> theFarm = new ArrayList<>();
    Wolf ghost = new Wolf("Ghost", 1, 10, 5, 5, true, false);
    RoboWolf mechaGhost = new RoboWolf("MechaGhost", 1, 10, 5, 5, true, false);
    Dragon falcor = new Dragon("Falcor", 1, 10, 5, 5, true);

    public void populate() {
        theFarm.add(ghost);
        theFarm.add(mechaGhost);
        theFarm.add(falcor);
    }

    public void allTick() {
        for (Pet x : theFarm) {
            x.tick();
        }
    }

    public void allStats() {
        for (Pet x : theFarm) {
            x.status();
        }
    }

    public void add() {
        Scanner input = new Scanner(System.in);
        System.out.println("What type of pet do you have?" +
                "\n [A] Wolf" +
                "\n [B] Dragon" +
                "\n [C] Robot Wolf" +
                "\n [D] Robot Dragon");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("A")) {
            System.out.println("What is your wolf's name?");
            String newName = input.nextLine();
            Wolf newWolf = new Wolf(newName, 1, 10, 5, 5, true, false);
            theFarm.add(newWolf);
            System.out.println(newName + " has been admitted into the shelter.");
        }
        if (choice.equalsIgnoreCase("B")) {
            System.out.println("What is your dragon's name?");
            String newName = input.nextLine();
            Dragon newDragon = new Dragon(newName, 1, 10, 5, 5, true);
            theFarm.add(newDragon);
            System.out.println(newName + " has been admitted into the shelter.");
        }
        if (choice.equalsIgnoreCase("C")) {
            System.out.println("What is your robot wolf's name?");
            String newName = input.nextLine();
            RoboWolf newRoboWolf = new RoboWolf(newName, 1, 10, 5, 5, true, false);
            theFarm.add(newRoboWolf);
            System.out.println(newName + " has been admitted into the shelter.");
        }
        if (choice.equalsIgnoreCase("D")) {
            System.out.println("What is your robot dragon's name?");
            String newName = input.nextLine();
            RoboDragon newRoboDragon = new RoboDragon(newName, 1, 10, 5, 5, true);
            theFarm.add(newRoboDragon);
            System.out.println(newName + " has been admitted into the shelter.");
        }
    }

    public void feedOrganics() {
        for (Pet x : theFarm) {
            if (x instanceof Organic) {
                ((Organic) x).feed();
            }
        }
        System.out.println("Organic pets received -5 hunger.");
    }

    public void playOrganics() {
        for (Pet x : theFarm) {
            if (x instanceof Organic) {
                ((Organic) x).play();
            }
        }
        System.out.println("Organic pets received +5 happiness.");
    }

    public void troubleshootRobotics() {
        for (Pet x : theFarm) {
            if (x instanceof Robotic) {
                ((Robotic) x).troubleshoot();
            }
        }
        System.out.println("Robotic pets received -5 errors.");
    }

    public void rechargeRobotics() {
        for (Pet x : theFarm) {
            if (x instanceof Robotic) {
                ((Robotic) x).recharge();
            }
        }
        System.out.println("Robotic pets received +5 charge.");
    }

    public void cleanCages() {
        for (Pet x : theFarm) {
            if (x instanceof Organic) {
                ((Organic) x).clean();
            }
        }
        System.out.println("Filthy cages have been cleaned.");
    }

    public void fixRobotics() {
        for (Pet x : theFarm) {
            if (x instanceof Robotic) {
                ((Robotic) x).fix();
            }
        }
        System.out.println("Broken robotics have been fixed.");
    }

    public void walkWolves() {
        for (Pet x : theFarm) {
            if (x instanceof Wolf) {
                ((Wolf) x).walk();
            }
            if (x instanceof RoboWolf) {
                ((RoboWolf) x).walk();
            }
        }
        System.out.println("All wolves have been walked. " +
                "\nOrganics now have a smaller chance of soiling their cage." +
                "\nRobotics received -1 charge and +1 error.");
    }

    public void adopt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a pet's name to adopt it: ");
        String choice = input.nextLine();
        int adopted = 0;
        boolean found = false;
        for (Pet x : theFarm) {
            if (x.name.equalsIgnoreCase(choice)) {
                System.out.println("You're taking " + x.name + " home with you!");
                adopted = theFarm.indexOf(x);
                found = true;
                if (x instanceof Wolf || x instanceof RoboWolf) {
                    System.out.println("\n" +
                            "                            .d$$b\n" +
                            "                          .' TO$;\\\n" +
                            "                         /  : TP._;\n" +
                            "                        / _.;  :Tb|\n" +
                            "                       /   /   ;j$j\n" +
                            "                   _.-\"       d$$$$\n" +
                            "                 .' ..       d$$$$;\n" +
                            "                /  /P'      d$$$$P. |\\\n" +
                            "               /   \"      .d$$$P' |\\^\"l\n" +
                            "             .'           `T$P^\"\"\"\"\"  :\n" +
                            "         ._.'      _.'                ;\n" +
                            "      `-.-\".-'-' ._.       _.-\"    .-\"\n" +
                            "    `.-\" _____  ._              .-\"\n" +
                            "   -(.g$$$$$$$b.              .'\n" +
                            "     \"\"^^T$$$P^)            .(:\n" +
                            "       _/  -\"  /.'         /:/;\n" +
                            "    ._.'-'`-'  \")/         /;/;\n" +
                            " `-.-\"..--\"\"   \" /         /  ;\n" +
                            ".-\" ..--\"\"        -'          :\n" +
                            "..--\"\"--.-\"         (\\      .-(\\\n" +
                            "  ..--\"\"              `-\\(\\/;`\n" +
                            "    _.                      :\n" +
                            "                            ;`-\n" +
                            "                           :\\\n" +
                            "                           ;  ");
                }
                if (x instanceof Dragon || x instanceof RoboDragon) {
                    System.out.println("\n" +
                            "                            ==(W{==========-      /===-                        \n" +
                            "                              ||  (.--.)         /===-_---~~~~~~~~~------____  \n" +
                            "                              | \\_,|**|,__      |===-~___                _,-' `\n" +
                            "                 -==\\\\        `\\ ' `--'   ),    `//~\\\\   ~~~~`---.___.-~~      \n" +
                            "             ______-==|        /`\\_. .__^\\ \\    | |  \\\\           _-~`         \n" +
                            "       __--~~~  ,-/-==\\\\      (   | .  |~~~~|   | |   `\\        ,'             \n" +
                            "    _-~       /'    |  \\\\     )__/==0==-\\<>/   / /      \\      /               \n" +
                            "  .'        /       |   \\\\      /~\\___/~~\\/  /' /        \\   /'                \n" +
                            " /  ____  /         |    \\`\\.__/-~~   \\  |_/'  /          \\/'                  \n" +
                            "/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`                   \n" +
                            "                  \\_|      /        _) | ;  ),   __--~~                        \n" +
                            "                    '~~--_/      _-~/- |/ \\   '-~ \\                            \n" +
                            "                   {\\__--_/}    / \\\\_>-|)<__\\      \\                           \n" +
                            "                   /'   (_/  _-~  | |__>--<__|      |                          \n" +
                            "                  |   _/) )-~     | |__>--<__|      |                          \n" +
                            "                  / /~ ,_/       / /__>---<__/      |                          \n" +
                            "                 o-o _//        /-~_>---<__-~      /                           \n" +
                            "                 (^(~          /~_>---<__-      _-~                            \n" +
                            "                ,/|           /__>--<__/     _-~                               \n" +
                            "             ,//('(          |__>--<__|     /                  .----_          \n" +
                            "            ( ( '))          |__>--<__|    |                 /' _---_~\\        \n" +
                            "         `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\      \n" +
                            "        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||      \n" +
                            "      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'       \n" +
                            "    `~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/                  \n" +
                            "  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~                    \n" +
                            "   ;'( ')/ ,)(                              ~~~~~~~~~~                         \n" +
                            "  ' ') '( (/                                                                   \n" +
                            "    '   '  `");
                }
            }
        }
        if (found) {
            theFarm.remove(adopted);
        }
    }

    public void specialAttention() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a pet's name to give it special care.");
        String choice = input.nextLine();
        for (Pet x : theFarm) {
            if (x.name.equalsIgnoreCase(choice)) {
                System.out.println("You selected " + x.name + " .");
                if (x instanceof Organic) {
                    ((Organic) x).feed();
                    ((Organic) x).play();
                    System.out.println(x.name + " received -5 hunger and +5 happiness.");
                }
                if (x instanceof Robotic) {
                    ((Robotic) x).recharge();
                    ((Robotic) x).troubleshoot();
                    System.out.println(x.name + " received +5 charge and -5 errors.");
                }
            }
        }
    }

    public void deadPets() {
        int dead = 0;
        boolean found = false;
        for (Pet x : theFarm) {
            if (x.health == 0) {
                System.out.println(x.name + " has died...");
                dead = theFarm.indexOf(x);
                found = true;
            }
        }
        if (found) {
            theFarm.remove(dead);
        }
    }
}
