package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        System.out.println("Welcome to Virtual Pet!");

        VirtualShelter theBarn = new VirtualShelter();
        theBarn.populate();

        Game theGame = new Game();

        int choice = 0;
        Scanner input = new Scanner(System.in);

        while (choice != 7) {

            menu();

            choice = input.nextInt();

            if (choice == 1) {
                theBarn.status();
            }
            if (choice == 2) {
                theBarn.add();
            }
            if (choice == 3) {
                theBarn.takeWalk();
            }
            if (choice == 4) {
                theBarn.adopt();
            }
            if (choice == 5) {
                theBarn.donate();
            }
            if (choice == 6) {
                theGame.play();
            }
        }

        System.out.println("Thanks for playing!");
        input.close();

    }

    public static void menu() {
        String dashes = "-";
        for (int i = 0; i < 99; i++) {
            dashes = dashes + "-";
        }
        System.out.println(dashes);
        System.out.println(
                  "[1] See all pets and stats" +
                "\n[2] Add new pet rock to the shelter" +
                "\n[3] Take a shelter pet for a walk" +
                "\n[4] Adopt a pet from shelter (if you have a currently adopted pet they will be set free)" +
                "\n[5] Donate $$$ (equalize all pet stats)" +
                "\n[6] Play game with adopted pet" +
                "\n[7] Exit");
        System.out.println(dashes);

    }

}
