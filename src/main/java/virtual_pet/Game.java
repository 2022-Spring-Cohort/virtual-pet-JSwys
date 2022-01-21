package virtual_pet;

import java.util.Scanner;

public class Game {

// new object and states

    public VirtualPet petOne = new VirtualPet("Rocky", "Rock", 4, 5, 5);

    Scanner input = new Scanner(System.in);

    public void play() {

        petOne.greeting();

        int biteCheck = 0;
        int wallowCheck = 0;
        int boredCheck = 0;
        int choice = 0;

        while (petOne.getHungerLevel() < 10 && petOne.getHappyLevel() > 0 && petOne.getHappyLevel() < 10) {

            // bite, wallow, bored, birthday checks

            if(petOne.getHappyLevel() >= 10) {
                petOne.winMessage();
            }

            if (petOne.getAge() % 10 == 0 && petOne.getAge() != 0) {
                petOne.birthday();
            }

            if (petOne.getHungerLevel() >= 7) {
                biteCheck = (int)(Math.random() * 10 + 1);
                if (biteCheck > 6) {
                    petOne.bite();
                }
                if (petOne.getHappyLevel() < 1) {
                    break;
                }
            }
            if (petOne.getHappyLevel() <= 3) {
                wallowCheck = (int)(Math.random() * 10 + 1);
                if (wallowCheck > 6) {
                    petOne.wallow();
                }
                if (petOne.getHungerLevel() > 9) {
                    break;
                }
            }
            if (petOne.getAge() > 3 && petOne.getHungerLevel() < 7 && petOne.getHappyLevel() > 3) {
                boredCheck = (int)(Math.random() * 10 + 1);
                if (boredCheck > 5) {
                    petOne.bored();
                }
                if (petOne.getHappyLevel() < 1 || petOne.getHungerLevel() > 9) {
                    break;
                }
            }

            // gameplay loop

            petOne.status();

            System.out.println ("Press 1 to feed me or 2 to comfort me:");
            choice = input.nextInt();

            if (choice == 1) {
                petOne.feed();
            }
            else if (choice == 2) {
                petOne.comfort();
            }
            else {
                System.out.println("Please pay attention to me!");
            }

            petOne.tick();

        }
        if (petOne.getHappyLevel() >= 10) {
            petOne.winMessage();
        }
        else {
            petOne.deathMessage();
        }
    }
}
