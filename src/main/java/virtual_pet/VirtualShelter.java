package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

import static virtual_pet.VirtualPetApplication.*;

public class VirtualShelter {

    ArrayList<VirtualPet> myShelter = new ArrayList<>();
    VirtualPet rocky = new VirtualPet("Rocky","Rock", 15, 1, 3);
    VirtualPet ghost = new VirtualPet("Ghost","Wolf", 33, 5, 7);
    VirtualPet falcor = new VirtualPet("Falcor", "Dragon", 51, 7, 5);
    static VirtualPet adopted = new VirtualPet("Blank", "Blank", 0, 9, 1);


    public void populate() {
        myShelter.add(rocky);
        myShelter.add(ghost);
        myShelter.add(falcor);
    }

    public void status() {
        System.out.println("The pets currently in the shelter are: ");
        for (VirtualPet x: myShelter) {
            System.out.println(x.getName() + ", " + x.getType() + ", " + x.getAge() + " days old, Hunger = " +
                    x.getHungerLevel() + ", Happy = " + x.getHappyLevel());
        }
    }

    public void add() {
        System.out.println("Please enter the name of your new pet: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        VirtualPet userCreated = new VirtualPet(name, "Rock", 0, 1, 3);
        myShelter.add(userCreated);
    }

    public void adopt() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a pet's name to adopt it: ");
        String choice = input.nextLine();
        for (VirtualPet x : myShelter) {
            if (x.getName().equalsIgnoreCase(choice)) {
                adopted = x;
                System.out.println("You've adopted " + adopted.getName() + ", " + adopted.getType() + ", " +
                        adopted.getAge() + " days old, Hunger = " + adopted.getHungerLevel() + ", Happy = " +
                        adopted.getHappyLevel());
            }
        }
        myShelter.remove(adopted);
    }

    public void takeWalk() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a pet's name to take it for a walk: ");
        String choice = input.nextLine();
        for (VirtualPet x : myShelter) {
            if (x.getName().equalsIgnoreCase(choice)) {
                x.walk();
            }
        }
    }

    public void donate() {
        for (VirtualPet x : myShelter) {
            x.normalize();
        }
    }
}
