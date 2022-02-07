package virtual_pet;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualShelter theFarm = new VirtualShelter();
        theFarm.populate();

        Scanner input = new Scanner(System.in);
        int choice = 0;

        String dashes = "-";
        for (int i = 0; i < 99; i++) {
            dashes = dashes + "-";
        }

        String menu = dashes +
                "\n [1] Display all pets and stats" +
                "\n [2] Admit a new pet to the shelter" +
                "\n [3] Choose a pet to give special attention" +
                "\n [4] Feed all organic pets" +
                "\n [5] Troubleshoot all robotic pets" +
                "\n [6] Play with all organic pets" +
                "\n [7] Charge all robotic pets" +
                "\n [8] Clean cages of organics " +
                "\n [9] Fix broken robotics" +
                "\n [10] Take wolves for a walk " +
                "\n [11] Adopt a pet " +
                "\n [12] Exit" +
                "\n" + dashes;


        System.out.println("Welcome to The Farm! Each day the organic pets in the shelter will lose 1 happiness and " +
                "\ngain 1 hunger. Robotic pets will lose 1 charge and gain 1 error. Aside from choice 1 and 12, every action " +
                "\nin the menu will start a new day. If a pet is neglected it has a chance at losing health. If happiness" +
                "\nor charge drop to 0, pets will lose 1 health each day. If hunger or errors reach 10, pets will lose 1 health" +
                "\neach day. If health reaches 0, the pet will die. See how long you can keep your pets alive! For more " +
                "\ndifficulty add pets. For an easier experience adopt pets from the shelter. Good luck!");

        while (choice != 12) {

            System.out.println(menu);
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    theFarm.allStats();
                    break;
                case 2:
                    theFarm.add();
                    theFarm.allTick();
                    theFarm.deadPets();
                    break;
                case 3:
                    theFarm.specialAttention();
                    theFarm.allTick();
                    theFarm.deadPets();
                    break;
                case 4:
                    theFarm.feedOrganics();
                    theFarm.allTick();
                    theFarm.deadPets();
                    break;
                case 5:
                    theFarm.troubleshootRobotics();
                    theFarm.allTick();
                    theFarm.deadPets();
                    break;
                case 6:
                    theFarm.playOrganics();
                    theFarm.allTick();
                    theFarm.deadPets();
                    break;
                case 7:
                    theFarm.rechargeRobotics();
                    theFarm.allTick();
                    theFarm.deadPets();
                    break;
                case 8:
                    theFarm.cleanCages();
                    theFarm.allTick();
                    theFarm.deadPets();
                    break;
                case 9:
                    theFarm.fixRobotics();
                    theFarm.allTick();
                    theFarm.deadPets();
                    break;
                case 10:
                    theFarm.walkWolves();
                    theFarm.allTick();
                    theFarm.deadPets();
                    break;
                case 11:
                    theFarm.adopt();
                    theFarm.allTick();
                    theFarm.deadPets();
                    break;
            }
        }
    }
}