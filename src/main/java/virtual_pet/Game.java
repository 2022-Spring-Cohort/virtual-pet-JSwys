package virtual_pet;

import java.util.Scanner;

public class Game {

    public void play() {



//
//        VirtualShelter.adopted.greeting();
//
//        Scanner input = new Scanner(System.in);
//
//        while (VirtualShelter.adopted.getHungerLevel() < 10 && VirtualShelter.adopted.getHappyLevel() > 0 && VirtualShelter.adopted.getHappyLevel() < 10) {
//
//            int biteCheck;
//            int wallowCheck;
//            int boredCheck;
//            int choice;
//
//            // bite, wallow, bored, birthday checks
//
//            if (VirtualShelter.adopted.getHappyLevel() >= 10) {
//                VirtualShelter.adopted.winMessage();
//            }
//
//            if (VirtualShelter.adopted.getAge() % 10 == 0 && VirtualShelter.adopted.getAge() != 0) {
//                VirtualShelter.adopted.birthday();
//            }
//
//            if (VirtualShelter.adopted.getHungerLevel() >= 7) {
//                biteCheck = (int) (Math.random() * 10 + 1);
//                if (biteCheck > 6) {
//                    VirtualShelter.adopted.bite();
//                }
//                if (VirtualShelter.adopted.getHappyLevel() < 1) {
//                    break;
//                }
//            }
//            if (VirtualShelter.adopted.getHappyLevel() <= 3) {
//                wallowCheck = (int) (Math.random() * 10 + 1);
//                if (wallowCheck > 6) {
//                    VirtualShelter.adopted.wallow();
//                }
//                if (VirtualShelter.adopted.getHungerLevel() > 9) {
//                    break;
//                }
//            }
//            if (VirtualShelter.adopted.getAge() > 3 && VirtualShelter.adopted.getHungerLevel() < 7 &&
//                    VirtualShelter.adopted.getHappyLevel() > 3) {
//                boredCheck = (int) (Math.random() * 10 + 1);
//                if (boredCheck > 5) {
//                    VirtualShelter.adopted.bored();
//                }
//                if (VirtualShelter.adopted.getHappyLevel() < 1 || VirtualShelter.adopted.getHungerLevel() > 9) {
//                    break;
//                }
//            }
//
//            // gameplay loop
//
//            VirtualShelter.adopted.status();
//
//            System.out.println("Press 1 to feed me or 2 to comfort me:");
//            choice = input.nextInt();
//
//            if (choice == 1) {
//                VirtualShelter.adopted.feed();
//            } else if (choice == 2) {
//                VirtualShelter.adopted.comfort();
//            } else {
//                System.out.println("Please pay attention to me!");
//            }
//
//            VirtualShelter.adopted.tick();
//
//        }
//
//        if (VirtualShelter.adopted.getHappyLevel() >= 10) {
//            VirtualShelter.adopted.winMessage();
//        } else {
//            VirtualShelter.adopted.deathMessage();
//        }
    }
}
