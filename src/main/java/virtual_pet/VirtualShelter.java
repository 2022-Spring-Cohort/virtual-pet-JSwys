package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualShelter {

    public boolean open;

    ArrayList<Pet> theFarm = new ArrayList<>();
    Wolf ghost = new Wolf("Ghost", 21, 10,5, 5, true);
    RoboWolf mechaGhost = new RoboWolf("MechaGhost", 35, 10, 5, 5, true);

    public void populate() {
        theFarm.add(ghost);
        theFarm.add(mechaGhost);
    }

    public void allTick() {
        for (Pet x : theFarm) {
            x.tick();
        }
    }

    public void allStats() {
        for (Pet x: theFarm) {
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
            Wolf newWolf = new Wolf(newName, 1, 10, 5, 5, true);
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
            RoboWolf newRoboWolf = new RoboWolf(newName, 1, 10, 5, 5, true);
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
    }

    public void playOrganics() {
        for (Pet x : theFarm) {
            if (x instanceof Organic) {
                ((Organic) x).play();
            }
        }
    }

    public void troubleshootRobotics() {
        for (Pet x : theFarm) {
            if (x instanceof Robotic) {
                ((Robotic) x).troubleshoot();
            }
        }
    }

    public void rechargeRobotics() {
        for (Pet x : theFarm) {
            if (x instanceof Robotic) {
                ((Robotic) x).recharge();
            }
        }
    }


//
//    ArrayList<VirtualPet> myShelter = new ArrayList<>();
//    VirtualPet rocky = new VirtualPet("Rocky","Rock", 15, 1, 3);
//    VirtualPet ghost = new VirtualPet("Ghost","Wolf", 33, 5, 7);
//    VirtualPet falcor = new VirtualPet("Falcor", "Dragon", 51, 7, 5);
//    static VirtualPet adopted = new VirtualPet("Blank", "Blank", 0, 9, 1);
//
//
//    public void populate() {
//        myShelter.add(rocky);
//        myShelter.add(ghost);
//        myShelter.add(falcor);
//    }
//
//    public void status() {
//        System.out.println("The pets currently in the shelter are: ");
//        for (VirtualPet x: myShelter) {
//            System.out.println(x.getName() + ", " + x.getType() + ", " + x.getAge() + " days old, Hunger = " +
//                    x.getHungerLevel() + ", Happy = " + x.getHappyLevel());
//        }
//    }
//
//    public void add() {
//        System.out.println("Please enter the name of your new pet: ");
//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        VirtualPet userCreated = new VirtualPet(name, "Rock", 0, 1, 3);
//        myShelter.add(userCreated);
//    }
//
//    public void adopt() {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a pet's name to adopt it: ");
//        String choice = input.nextLine();
//        for (VirtualPet x : myShelter) {
//            if (x.getName().equalsIgnoreCase(choice)) {
//                adopted = x;
//                System.out.println("You've adopted " + adopted.getName() + ", " + adopted.getType() + ", " +
//                        adopted.getAge() + " days old, Hunger = " + adopted.getHungerLevel() + ", Happy = " +
//                        adopted.getHappyLevel());
//            }
//        }
//        myShelter.remove(adopted);
//    }
//
//    public void takeWalk() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a pet's name to take it for a walk: ");
//        String choice = input.nextLine();
//        for (VirtualPet x : myShelter) {
//            if (x.getName().equalsIgnoreCase(choice)) {
//                x.walk();
//            }
//        }
//    }
//
//    public void donate() {
//        for (VirtualPet x : myShelter) {
//            x.normalize();
//        }
//    }
}
