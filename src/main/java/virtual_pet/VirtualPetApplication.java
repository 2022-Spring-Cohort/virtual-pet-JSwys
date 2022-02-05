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
                "\n [1] Display all pets and status" +
                "\n [2] Admit a new pet to the shelter" +
                "\n [3] Feed all organic pets" +
                "\n [4] Troubleshoot all robotic pets" +
                "\n [5] Play with all organic pets" +
                "\n [6] Charge all robotic pets" +
                "\n [7] Clean cages of organics " +
                "\n [8] Fix broken robotics" +
                "\n [8] Take wolves for a walk " +
                "\n [9] Adopt a pet " +
                "\n [10] Exit" +
                "\n" + dashes;


        while (choice != 10) {

            System.out.println(menu);
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    theFarm.allStats();
                    break;
                case 2:
                    theFarm.add();
                    theFarm.allTick();
                    break;
                case 3:
                    theFarm.feedOrganics();
                    theFarm.allTick();
                    break;
                case 4:
                    theFarm.troubleshootRobotics();
                    theFarm.allTick();
                    break;
                case 5:
                    theFarm.playOrganics();
                    theFarm.allTick();
                    break;
                case 6:
                    theFarm.rechargeRobotics();
                    theFarm.allTick();
            }
        }
    }
}







//        System.out.println("Welcome to Virtual Pet!");
//
//        VirtualShelter theBarn = new VirtualShelter();
//        theBarn.populate();
//
//        Game theGame = new Game();
//
//        int choice = 0;
//        Scanner input = new Scanner(System.in);
//
//        while (choice != 7) {
//
//            menu();
//
//            choice = input.nextInt();
//
//            if (choice == 1) {
//                theBarn.status();
//            }
//            if (choice == 2) {
//                theBarn.add();
//            }
//            if (choice == 3) {
//                theBarn.takeWalk();
//            }
//            if (choice == 4) {
//                theBarn.adopt();
//            }
//            if (choice == 5) {
//                theBarn.donate();
//            }
//            if (choice == 6) {
//                theGame.play();
//            }
//        }
//
//        System.out.println("Thanks for playing!");
//        input.close();
//
//    }
//
//    public static void menu() {
//        String dashes = "-";
//        for (int i = 0; i < 99; i++) {
//            dashes = dashes + "-";
//        }
//        System.out.println(dashes);
//        System.out.println(
//                  "[1] See all pets and stats" +
//                "\n[2] Add new pet rock to the shelter" +
//                "\n[3] Take a shelter pet for a walk" +
//                "\n[4] Adopt a pet from shelter (if you have a currently adopted pet they will be set free)" +
//                "\n[5] Donate $$$ (equalize all pet stats)" +
//                "\n[6] Play game with adopted pet" +
//                "\n[7] Exit");
//        System.out.println(dashes);


